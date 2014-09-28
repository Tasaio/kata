package hanoi;

/**
 * @author Tasaio
 */
public class Move {
	private int from;
	private int to;

	public Move(int from, int to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Move move = (Move) o;

		if (from != move.from) return false;
		if (to != move.to) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = from;
		result = 31 * result + to;
		return result;
	}

	@Override
	public String toString() {
		return "Move{" +
				"from=" + from +
				", to=" + to +
				'}';
	}
}
