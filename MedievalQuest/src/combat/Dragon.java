package combat;

import java.util.Scanner;

import Structure.Heros;
import Structure.Personnage;
import interaction.AsciiArt;
import interaction.Saisie;

public class Dragon {
	public static void star(Personnage p) {
		Scanner sc = new Scanner(System.in);
		Saisie.clearScreenOpti();
		System.out.println(p.getHud());
		System.out.println("Vous entrez dans l'antre du terrible, Tartampion le dragon !\n"
				+ "Vous sortez votre epee et vous le provoquez en lui disant : (Entrez une phrase de votre choix)\n");
		String phrase = sc.nextLine();
		
		
		Heros boss = new Heros(100, 15, 20, 42);
		while(p.getVie() > 0 && boss.getVie() > 0) {
			AsciiArt.hero_bossFinal();
			Combat.startCombat(p, boss);
		}
		
		
	}
}
