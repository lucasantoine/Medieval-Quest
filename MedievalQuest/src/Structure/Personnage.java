package Structure;

import affichage.Hud;
import interaction.Saisie;
import util.EStat;
import util.Effet;

public abstract class Personnage {
	private Hud hud;
	
	public Personnage(int vie, int atk, int def, int arg) {
		this.hud = new Hud(vie, atk, def, arg);
	}
	
	public Personnage() {
		this.hud = new Hud();
	}
	
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
	
	public void setVie(int vie) {
		hud.setVie(vie);
	}
	
	public void setAttaque(int attaque) {
		hud.setAttaque(attaque);
	}
	
	public void setDefense(int defense) {
		hud.setDefense(defense);
	}
	
	public void setArgent(int argent) {
		hud.setArgent(argent);
	}
	
	public int getStatValue(EStat stat) {
		for(int i = 0; i < hud.getStats().length; i++) {
			if(hud.getStats()[i].getStat() == stat) return hud.getStats()[i].getValue();
		}
		return 0;
	}
	
	public void doEffet(Effet effet) {
		
	}
	
	
	public Hud getHud() {
		return hud;
	}

	public void setHud(Hud hud) {
		this.hud = hud;
	}

	public void choseClasse() {
		String saisie = Saisie.saisie("Quelle est votre : 1 - Chevalier, 2 - Assassin, 3 - Tank", 3);
		int saisieToString = Saisie.stringToInt(saisie);
		
		if(saisieToString == 1) {
			this.setHud(new Hud(10, 5, 5, 5));
		}else if(saisieToString == 2) {
			this.setHud(new Hud(5, 10, 5, 5));
		}else if(saisieToString == 3) {
			this.setHud(new Hud(5, 5, 10, 5));
		}
	}
	
	public abstract String getImage();
}
