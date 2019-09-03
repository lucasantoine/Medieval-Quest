package combat;

import java.util.Random;

import Structure.Personnage;
import interaction.Saisie;
import util.EStat;
import util.Effet;

public class Combat {
	
	public static void startCombat(Personnage player, Personnage ennemi) {
		Random r = new Random();
		
		while(player.getVie() > 0 && ennemi.getVie() > 0) {
			System.out.println("Joueur :\n"+player.getHud().toString()+"\nEnnemi :\n"+ennemi.getHud().toString());
			String s = Saisie.saisie("Que decidez vous de faire ( 1 - Attaquer, 2 - Defendre) : \n", 2);
			int choix = Saisie.stringToInt(s);
			if(choix == 1) player.setAttaqueBool(true);
			if(choix == 2) player.setAttaqueBool(false);
			
			if(r.nextInt(2) == 0) {
				ennemi.setAttaqueBool(true);
			}else {
				ennemi.setAttaqueBool(false);
			}
			
			if(player.isAttaque()) ennemi.doEffet(new Effet(EStat.VIE, player.getAtk()));
			if(ennemi.isAttaque()) player.doEffet(new Effet(EStat.VIE, ennemi.getAtk()));
			System.out.println(player.getVie() + "   " + ennemi.getVie());
			Saisie.clearScreenOpti();
		}
	}
}
