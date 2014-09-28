package hanoi;

import junit.framework.TestCase;

public class HanoiTowerTest extends TestCase {

	private Solution solution(Move... moves) {
		Solution solution = new Solution();
		for (Move move : moves) {
			solution.add(move);
		}
		return solution;
	}

	public void testSingle() throws Exception {
		assertEquals(
				solution(
						new Move(1, 3)
				),
				HanoiTower.getMoves(1)
		);
	}

	public void testDouble() throws Exception {
		assertEquals(
				solution(
						new Move(1, 2),
						new Move(1, 3),
						new Move(2, 3)
				),
				HanoiTower.getMoves(2)
		);
	}

	public void testTriple() throws Exception {
		assertEquals(
				solution(
						new Move(1, 3),
						new Move(1, 2),
						new Move(3, 2),
						new Move(1, 3),
						new Move(2, 1),
						new Move(2, 3),
						new Move(1, 3)
				),
				HanoiTower.getMoves(3)
		);
	}

	public void testQuad() throws Exception {
		assertEquals(
				solution(
						new Move(1, 2),
						new Move(1, 3),
						new Move(2, 3),
						new Move(1, 2),
						new Move(3, 1),
						new Move(3, 2),
						new Move(1, 2),
						new Move(1, 3),
						new Move(2, 3),
						new Move(2, 1),
						new Move(3, 1),
						new Move(2, 3),
						new Move(1, 2),
						new Move(1, 3),
						new Move(2, 3)
				),
				HanoiTower.getMoves(4)
		);
	}
}