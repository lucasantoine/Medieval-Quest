package Structure;

import affichage.Hud;
import interaction.Saisie;

public abstract class Personnage {
	private Hud hud = new Hud();
	
	public int getVie() {
		return this.hud.getStats()[0].getValue();
	}
	
	public int getAtk() {
		return this.hud.getStats()[1].getValue();
	}
	
	public int getDef() {
		return this.hud.getStats()[2].getValue();
	}
	
	public int getArg() {
		return this.hud.getStats()[3].getValue();
	}

	public Hud getHud() {
		return hud;
	}

	public void setHud(Hud hud) {
		this.hud = hud;
	}

	public void choseClasse() {
		String saisie = Saisie.saisie("Choississez votre Classe : 1 - Tank, 2 - Chevalier, 3 - Assassin", 3);
		int saisieToString = Saisie.stringToInt(saisie);
	}

}
