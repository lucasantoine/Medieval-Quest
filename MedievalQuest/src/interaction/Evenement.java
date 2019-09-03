package interaction;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Structure.Auberge;
import Structure.Coffre;
import Structure.Fontaine;
import Structure.Forge;
import Structure.Garde;
import Structure.Maison;
import Structure.Mendiant;
import Structure.Personnage;
import Structure.Pretre;
import Structure.Voleur;
import main.Game;
import util.IEvenement;

public class Evenement {
	private List<IEvenement> list;
	
	public Evenement() {
		list = new ArrayList<>();
	}
	
	public Evenement(IEvenement... evenements) {
		this();
		for(IEvenement evenement : evenements)
			list.add(evenement);
	}
	
	public static void launchRandomEvent(Personnage p) {
		Random r = new Random();
		switch(r.nextInt(9)) {
			case 0:
				Auberge.auberge(p);
				break;
			case 1:
				Coffre.coffre(p);
				break;
			case 2:
				Garde.garde(p);
				break;
			case 3:
				Mendiant.mendiant(p);
				break;
			case 4:
				Pretre.pretre(p);
				break;
			case 5:
				Voleur.voleur(p);
				break;
			case 6:
				Maison.maison(p);
				break;
			case 7:
				Forge.forge(p);
			case 8:
				Fontaine.maison(p);
		}
		Game.checkStats(p);
	}
}
