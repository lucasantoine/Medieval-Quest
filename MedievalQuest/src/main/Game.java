package main;



import Structure.Heros;
import Structure.Personnage;
import combat.Dragon;
import combat.PremierBoss;
import combat.Sorciere;
import interaction.AsciiArt;
import interaction.Evenement;
import interaction.Saisie;
import menu.Context;
import menu.EcranTitre;

public class Game {
	public static String barAvancement = "                  Progression : O════════⚔════⚔══⚔";
	public static void main(String[] args) {
		while(true) {
			EcranTitre.showHomeScreen();
			Context.showContext();
			Heros player = new Heros();
			player.choseClasse();
			Saisie.clearScreenOpti();
			

			int tour = 1;
			
			while(player.getVie() >= 0 && player.getArg() >= 0 && tour <= 10) {
				System.out.println(barAvancement);
				if(tour == 5) {
					PremierBoss.start(player); 
					checkStats(player);
				}else if(tour == 8) {
					Sorciere.start(player);
					checkStats(player);
				}else if(tour == 10) {
					Dragon.star(player);
					checkStats(player);
				}else{ 
					Evenement.launchRandomEvent(player);
				}
				tour++;
				barAvancement = bar(tour);
			}
			
			if(tour > 10) {
				Saisie.clearScreenOpti();
				Saisie.pressEnter("Vous avez terrassez le terrible dragon ! Le village vous acclame comme leur nouveau hero.", true);
				AsciiArt.chateauFin();
				Saisie.pressEnter("", true);
				Saisie.clearScreenOpti();
				Saisie.pressEnter("    ███      ▄██████▄      ▀█████████▄     ▄████████      ▄████████  ▄██████▄  ███▄▄▄▄       ███      ▄█  ███▄▄▄▄   ███    █▄     ▄████████ ████████▄      \n" + 
						"▀█████████▄ ███    ███       ███    ███   ███    ███     ███    ███ ███    ███ ███▀▀▀██▄ ▀█████████▄ ███  ███▀▀▀██▄ ███    ███   ███    ███ ███   ▀███     \n" + 
						"   ▀███▀▀██ ███    ███       ███    ███   ███    █▀      ███    █▀  ███    ███ ███   ███    ▀███▀▀██ ███▌ ███   ███ ███    ███   ███    █▀  ███    ███     \n" + 
						"    ███   ▀ ███    ███      ▄███▄▄▄██▀   ▄███▄▄▄         ███        ███    ███ ███   ███     ███   ▀ ███▌ ███   ███ ███    ███  ▄███▄▄▄     ███    ███     \n" + 
						"    ███     ███    ███     ▀▀███▀▀▀██▄  ▀▀███▀▀▀         ███        ███    ███ ███   ███     ███     ███▌ ███   ███ ███    ███ ▀▀███▀▀▀     ███    ███     \n" + 
						"    ███     ███    ███       ███    ██▄   ███    █▄      ███    █▄  ███    ███ ███   ███     ███     ███  ███   ███ ███    ███   ███    █▄  ███    ███     \n" + 
						"    ███     ███    ███       ███    ███   ███    ███     ███    ███ ███    ███ ███   ███     ███     ███  ███   ███ ███    ███   ███    ███ ███   ▄███     \n" + 
						"   ▄████▀    ▀██████▀      ▄█████████▀    ██████████     ████████▀   ▀██████▀   ▀█   █▀     ▄████▀   █▀    ▀█   █▀  ████████▀    ██████████ ████████▀      \n" + 
						"                                                                                                                                                        ", true);
			}
		}
	}
	
	public static void checkStats(Personnage p) {
		if(p.getVie() <=0) {
			System.out.println("Vous etes mort par KO !");
			System.out.println("Plus de vie.");
			System.exit(0);
		}
		if(p.getAtk() <= 1) {
			p.getHud().setAttaque(1);
		}
		if(p.getDef() <= 0) {
			p.getHud().setDefense(0);
		}
		if(p.getArg() < 0 ) {
			System.out.println("Vous etes ruine !");
			System.out.println("Plus d'argent");
			System.exit(0);
			
		}		
	}
	
	public static String bar(int tour) {
		String str = "                  Progression : ";
		for(int i = 0; i <= 10; i++) {
			if(i == 5 || i == 8 || i == 10) {
				str += "⚔";
			}else if(tour != i) str += "══";
			if(i == tour) str += "O";
		}
		return str ;
	}
}