package Structure;

public abstract class Personnage {
	private int vie = 10;
	private int atk = 10;
	private int def = 10;
	private int arg = 10;
	
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public void setArg(int arg) {
		this.arg = arg;
	}
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
	public int getArg() {
		return arg;
	}
}
