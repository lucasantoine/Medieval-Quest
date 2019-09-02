package util;

public class Effet {
	private EStat stat;
	private int val;
	
	public Effet(EStat stat, int val) {
		this.stat = stat;
		this.val = val;
	}

	public EStat getStat() {
		return stat;
	}

	public int getVal() {
		return val;
	}
	
	

}
