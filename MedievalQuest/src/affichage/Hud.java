package affichage;

import util.EStat;
import util.Statistique;

public class Hud {	
	private Statistique[] stats = new Statistique[4];	
	
	public Hud(int vie, int attaque, int defense, int argent) {
		this.stats[0] = new Statistique(vie, EStat.VIE);
		this.stats[1] = new Statistique(attaque, EStat.ATK);
		this.stats[2] = new Statistique(defense, EStat.DEF);
		this.stats[3] = new Statistique(argent, EStat.ARG);
	}
	
	public Hud() {
		this(10, 10, 10, 10);
	}
	
	public void setStats(int vie, int attaque, int defense, int argent) {
		this.stats[0].setValue(vie);
		this.stats[1].setValue(attaque);
		this.stats[2].setValue(defense);
		this.stats[3].setValue(argent);
	}
	
	public void setVie(int vie) {
		this.stats[0].setValue(vie);
	}
	
	public void setAttaque(int attaque) {
		this.stats[1].setValue(attaque);
	}

	public void setDefense(int defense) {
		this.stats[2].setValue(defense);
	}

	public void setArgent(int argent) {
		this.stats[3].setValue(argent);
	}
	
	public int getVie() {
		return stats[0].getValue();
	}
	
	public int getAttaque() {
		return stats[1].getValue();
	}
	
	public int getDefense() {
		return stats[2].getValue();
	}
	
	public int getArgent() {
		return stats[3].getValue();
	}


	
	public Statistique[] getStats() {
		return stats;
	}

	public String toString() {
		return "═════════════════════════════════════════════════════════════════════════════════════════════════════════════\n"
			+"                  "+stats[0].toString()+"                  "+stats[1].toString()+"                  "+stats[2].toString()+"                  "+stats[3].toString()+"\n"
			+  "═════════════════════════════════════════════════════════════════════════════════════════════════════════════";
	}
}
