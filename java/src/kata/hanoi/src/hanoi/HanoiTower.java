package hanoi;

import java.util.Arrays;
import java.util.List;

/**
 * @author Tasaio
 */
public class HanoiTower {
	private final static int firstPin = 1;
	private final static int secondPin = 2;
	private final static int thirdPin = 3;

	public static Solution getMoves(int towerHeight) {
		return getMovesInternal(towerHeight, firstPin, thirdPin);
	}

	private static Solution getMovesInternal(int height, int from, int to) {
		Solution solution = new Solution();
		if (height >= 1) {
			int temporaryTarget = getRemainingPin(from, to);
			int lowerLevel = height - 1;
			solution.addAll(getMovesInternal(lowerLevel, from, temporaryTarget));
			solution.addAll(addMove(from, to));
			solution.addAll(getMovesInternal(lowerLevel, temporaryTarget, to));
		}
		return solution;
	}

	private static int getRemainingPin(int a, int b) {
		List<Integer> list = Arrays.asList(a, b);
		if (list.contains(firstPin) && list.contains(secondPin)) {
			return thirdPin;
		}
		else if (list.contains(firstPin)) {
			return secondPin;
		}
		else if (list.contains(secondPin)) {
			return firstPin;
		}
		return -1;
	}

	private static Solution addMove(int from, int to) {
		Solution solution = new Solution();
		Move move = new Move(from, to);
		solution.add(move);
		System.out.println(String.format("Move added: %s", move));
		return solution;
	}
}
