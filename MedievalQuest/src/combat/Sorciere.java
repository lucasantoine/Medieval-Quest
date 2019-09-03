package combat;

import Structure.Heros;
import Structure.Personnage;
import interaction.AsciiArt;
import interaction.Saisie;

public class Sorciere {
	public static void start(Personnage p) {
		Saisie.clearScreenOpti();
		System.out.println(p.getHud());
		AsciiArt.hero_boss2();
		System.out.println("Vous arrivez dans le chateau du roi, la sorcière vous y attendait et vous a tendu un piege.");
		Saisie.pressEnter("Vous perdez la moitié de votre defense", true);
		p.setDefense(p.getDef()/2);
		Heros boss = new Heros(50, 3, 3, 50);
		while(p.getVie() > 0 && boss.getVie() > 0) {
			AsciiArt.hero_boss2();
			Combat.startCombat(p, boss);
		}
		
		Saisie.pressEnter("Vous avez vaincu la sorciere, maintenant vous vous rendez vers la salle du roi pour vaincre le terrible dragon", false);
	}
}
