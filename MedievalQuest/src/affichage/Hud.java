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
		this.stats[0].setValue(attaque);
	}

	public void setDefense(int defense) {
		this.stats[0].setValue(defense);
	}

	public void setArgent(int argent) {
		this.stats[0].setValue(argent);
	}


	
	public Statistique[] getStats() {
		return stats;
	}

	public String toString() {
		return stats[0].toString() + "          |          "
	+ stats[1].toString() + "          |          "
				+ stats[2].toString() + "          |          "
	+ stats[3].toString() + "\n\n----------------------------------------------------------------------------";
	}
}
