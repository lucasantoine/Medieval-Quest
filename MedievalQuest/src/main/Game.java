package main;



import Structure.Auberge;
import Structure.Coffre;
import Structure.Garde;
import Structure.Heros;
import interaction.Saisie;
import menu.EcranTitre;

public class Game {
	public static void main(String[] args) {
		EcranTitre.showHomeScreen();
		Heros player = new Heros();
		player.choseClasse();
		Saisie.clearScreenOpti();
		
		
		Coffre.coffre(player);
		
		Game.checkStats(player);
		
		
		Auberge.auberge(player);
		
		Game.checkStats(player);
		
		
		Garde.garde(player);
		
		Game.checkStats(player);
		
		
		
	}
	
	public static void checkStats(Heros player) {
		if(player.getVie() <=0) {
			System.out.println("Vous êtes mort par KO !");
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
			System.out.println("Vous êtes ruiné !");
			System.out.println("Plus d'argent");
			System.exit(0);
			
		}
		
		
	}
}