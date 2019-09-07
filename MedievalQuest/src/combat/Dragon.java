package combat;

import java.util.Scanner;

import Structure.Heros;
import Structure.Personnage;
import interaction.AsciiArt;
import interaction.Saisie;
import main.Game;

public class Dragon {
	public static void star(Personnage p) {
		int i = 0;
		String[] egg = new String[] { "IJava", "42", "Beaufils", "Tartampion", "Secq" };
		Scanner sc = new Scanner(System.in);
		Saisie.clearScreenOpti();
		System.out.println(p.getHud());
		Saisie.pressEnter("\nVous entrez dans la salledu Trône quand tout à coup...", false);
		Saisie.pressEnter("Le roi Tartampion se transforme vous appercoit et se transforme en Dragon !", false);
		
		System.out.println("\nVous sortez votre epee et vous le provoquez en lui disant : (Entrez une phrase de votre choix)\n");
		String phrase = sc.nextLine();

		Heros boss = new Heros(100, 15, 20, 42);

		int viebase = boss.getVie();

		while (i < egg.length && !phrase.equals(egg[i])) {
			i++;
		}

		if (i >= egg.length) {
			while (p.getVie() > 0 && boss.getVie() > 0) {
				AsciiArt.hero_bossFinal();
				Combat.startCombat(p, boss, viebase);
			}
		} else {
			switch (i) {
			case 0: AsciiArt.hero_bossFinal();
					Saisie.pressEnter("Le dragon devient fou a l'ecoute de ce mot et se met a se consumer devant vos yeux. Quel genre de sorcellerie avez vous utilise ?", true);
				;
				break;
			case 1: AsciiArt.hero_bossFinal();
					System.out.println("Une force mystique semble emaner de vous. Le dragon se met davantage sur ses gardes.");
					Saisie.pressEnter("Vous gagnez 42 points de vie, d'attaque et de defense.", true);
					p.getHud().getStats()[0].add(42);
					p.getHud().getStats()[1].add(42);
					p.getHud().getStats()[2].add(42);
					while (p.getVie() > 0 && boss.getVie() > 0) {
						AsciiArt.hero_bossFinal();
						Combat.startCombat(p, boss, viebase);
					}
				;
				break;
			case 2: AsciiArt.hero_bossFinal();
					System.out.println("Malheureusement pour vous, votre systeme immunitaire semble vous faire defaut et une intense lumiere bleue commence a vous aveugler.");
					Saisie.pressEnter("Vous perdez 15 points de vie, d'attaque et de defense.", true);
					p.getHud().getStats()[0].add(-15);
					p.getHud().getStats()[1].add(-15);
					p.getHud().getStats()[2].add(-15);
					Game.checkStats(p);
					while (p.getVie() > 0 && boss.getVie() > 0) {
						AsciiArt.hero_bossFinal();
						Combat.startCombat(p, boss, viebase);
					}
				;
				break;
			case 3: AsciiArt.hero_bossFinal();
					Saisie.pressEnter("Ne vous ai-je jamais prevenu de ne jamais prononce son nom ? Dans une rage folle, le dragon vous devore tout entier.", true);
					p.setVie(0);
				;
				break;
			case 4: AsciiArt.hero_bossFinal();
					System.out.println("En prononcant le nom de cet aventurier legendaire, rien ne semble plus en mesure de vous arreter.");
					Saisie.pressEnter("Vous gagnez 100 points de vie, d'attaque et de defense.", true);
					p.getHud().getStats()[0].add(100);
					p.getHud().getStats()[1].add(100);
					p.getHud().getStats()[2].add(100);
					while (p.getVie() > 0 && boss.getVie() > 0) {
						AsciiArt.hero_bossFinal();
						Combat.startCombat(p, boss, viebase);
					}
				;
				break;
			default:
				break;
			}
		}

	}
}
