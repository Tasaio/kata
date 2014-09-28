package hanoi;

import java.util.ArrayList;

/**
 * @author Tasaio
 */
public class Solution extends ArrayList<Move> {
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Solution solution = (Solution) o;
		if (size() != solution.size())
			return false;

		for (int i = 0; i < size(); i++) {
			if (!get(i).equals(solution.get(i)))
				return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		for (Move move : this) {
			hashCode += move.hashCode();
		}
		return hashCode;
	}
}
