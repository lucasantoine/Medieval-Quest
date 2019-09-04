package combat;

import java.util.Random;

import Structure.Personnage;
import interaction.AsciiArt;
import interaction.Saisie;
import util.EStat;
import util.Effet;

public class Combat {
	
	public static void startCombat(Personnage player, Personnage ennemi, int viebase) {
		Random r = new Random();
		System.out.println(" Joueur :\n"+player.getHud().toString()+"\n Ennemi :");
		
		if(ennemi.getVie() > (viebase/5)*4) AsciiArt.vieBoss5();
		else if(ennemi.getVie() > (viebase/4)*3) AsciiArt.vieBoss4();
		else if(ennemi.getVie() > (viebase/3)*2) AsciiArt.vieBoss3();
		else if(ennemi.getVie() > viebase/2) AsciiArt.vieBoss2();
		else if(ennemi.getVie() > 0) AsciiArt.vieBoss1();
		else AsciiArt.vieBoss0();

		String s = Saisie.saisie("Que décidez vous de faire ? ( 1 - Attaquer, 2 - Défendre) : \n", 2);
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
