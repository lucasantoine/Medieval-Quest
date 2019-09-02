package util;
public class Statistique {
	private String unite;
	private int val;
	
	public Statistique(String unite) {
		this.unite = unite;
		this.val = 0;		
	}
	
	public void add(int n) {
		val += n;
	}
	
	public int getValue() {
		return val;
	}
	
	public String toString() {
		return unite + " " + val;
	}
	
}
