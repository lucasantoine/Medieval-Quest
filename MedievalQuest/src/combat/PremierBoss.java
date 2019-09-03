package combat;

import Structure.Heros;
import Structure.Personnage;
import interaction.AsciiArt;
import interaction.Saisie;
import util.IEvenement;

public class PremierBoss implements IEvenement{

	public static void start(Personnage player) {
		AsciiArt.hero_boss1();
		System.out.println("Lors de votre croisade, vous vous faites arreter par un chevalier du roi avec une horde de betes sauvages qu'il lache sur vous.\n"
				+ "Vous n'avez pas d'autre choix que de sortir les armes");
		Combat.startCombat(player, new Heros(20, 5, 3, 50));
		System.out.println("Vous avez vaincu la horde et le chevalier a fuit le combat");
	}

}
