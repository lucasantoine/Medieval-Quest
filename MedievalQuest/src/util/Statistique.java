package util;

public class Statistique {
	private String unite;
	private int val;

	public Statistique(String unite) {
		this(unite, 0);
	}

	public Statistique(String unite, int val) {
		this.unite = unite;
		this.val = val;
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
