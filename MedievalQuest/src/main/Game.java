package main;



import Structure.Auberge;
import Structure.Coffre;
import Structure.Garde;
import Structure.Heros;
import Structure.Mendiant;
import Structure.Voleur;
import combat.PremierBoss;
import combat.Sorciere;
import interaction.Evenement;
import interaction.Saisie;
import menu.EcranTitre;

public class Game {
	public static void main(String[] args) {
		EcranTitre.showHomeScreen();
		Heros player = new Heros();
		Evenement event = new Evenement(new Coffre(), new Garde(), new Voleur(), new Mendiant(), new Auberge());
		player.choseClasse();
		Saisie.clearScreenOpti();
		

		
		Coffre.coffre(player);
		Game.checkStats(player);		
		
		Auberge.auberge(player);
		Game.checkStats(player);
		
		Garde.garde(player);
		Game.checkStats(player);
		
		Mendiant.mendiant(player);
		checkStats(player);
		
		Voleur.voleur(player);
		checkStats(player);
		
		PremierBoss.start(player);
		checkStats(player);
		
		Sorciere.start(player);
		checkStats(player);
		
		
		
	}
	
	public static void checkStats(Heros player) {
		if(player.getVie() <=0) {
			System.out.println("Vous etes mort par KO !");
			System.out.println("Plus de vie.");
			System.exit(0);
		}
		if(player.getAtk() <= 1) {
			player.getHud().setAttaque(1);
		}
		if(player.getDef() <= 0) {
			player.getHud().setDefense(0);
		}
		if(player.getArg() < 0 ) {
			System.out.println("Vous etes ruine !");
			System.out.println("Plus d'argent");
			System.exit(0);
			
		}
		
		
	}
}