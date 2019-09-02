package affichage;

import util.Statistique;

public class Hud {
	private Statistique vie;
	private Statistique attaque;
	private Statistique defense;
	private Statistique argent;
	
	public Hud() {
		vie = new Statistique("♥");
		attaque = new Statistique("⚔");
		defense = new Statistique("def");
		argent = new Statistique("$");
	}
	
	public Hud(int vie, int attaque, int defense, int argent) {
		this.vie = new Statistique("♥", vie);
		this.attaque = new Statistique("⚔", attaque);
		this.defense = new Statistique("def", defense);
		this.argent = new Statistique("$", argent);
	}

	public Statistique getVie() {
		return vie;
	}

	public Statistique getAttaque() {
		return attaque;
	}

	public Statistique getDefense() {
		return defense;
	}

	public Statistique getArgent() {
		return argent;
	}
	
	public String toString() {
		return vie.toString() + "          |          "
	+ attaque.toString() + "          |          "
				+ defense.toString() + "          |          "
	+ argent.toString() + "\n\n----------------------------------------------------------------------------";
	}
}
