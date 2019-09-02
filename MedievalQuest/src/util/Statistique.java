package util;

public class Statistique {
	private String unite;
	private int val;
	private EStat stat;

	public Statistique(String unite, EStat stat) {
		this(unite, 0, stat);
	}

	public Statistique(String unite, int val, EStat stat) {
		this.unite = unite;
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

	public String getUnite() {
		return unite;
	}

	public String toString() {
		return unite + " " + val;
	}

}
