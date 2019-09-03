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
		System.out.println("Vous arrivez dans le chateau du roi, la sorcière vous y attender et vous a tendu un piege.");
		Saisie.pressEnter("Vous perdez la moitier de votre defense", true);
		Combat.startCombat(p, new Heros(50, 3, 5, 10));
		Saisie.pressEnter("Appuyer sur ENTER pour passer a la suite", true);
		System.out.println("Vous avez vaincu la sorciere, maintenant vous vous rendez vers la salle du roi pour vaincre le terrible dragon");
	}
}
