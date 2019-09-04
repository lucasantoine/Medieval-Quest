package util;

public enum EStat {
	VIE("♥"), ATK("⚔"), DEF("def"), ARG("$");
	
	private String symbole;
	
	private EStat(String symbole) {
		this.symbole = symbole;
	}

	public String getSymbole() {
		return symbole;
	}
}
 