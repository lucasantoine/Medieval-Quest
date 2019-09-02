package util;

public class Statistique {
	private int val;
	private EStat stat;

	public Statistique(EStat stat) {
		this(0, stat);
	}

	public Statistique(int val, EStat stat) {
		this.val = val;
		this.stat = stat;
	}

	public void add(int n) {
		val += n;
	}

	public int getValue() {
		return val;
	}

	public void setValue(int val) {
		this.val = val;
	}

	public String toString() {
		return stat.getSymbole() + " " + val;
	}

	public EStat getStat() {
		return stat;
	}
}
