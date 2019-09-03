package combat;

import Structure.Heros;
import Structure.Personnage;
import interaction.AsciiArt;
import interaction.Saisie;
import util.IEvenement;

public class PremierBoss implements IEvenement{

	public static void start(Personnage player) {
		System.out.println("Lors de votre croisade, vous vous faites arreter par la sorciere du roi avec une horde de betes sauvages qu'il lache sur vous.\n"
				+ "Vous n'avez pas d'autre choix que de sortir les armes");
		Heros boss = new Heros(20, 5, 3, 50);
		while(player.getVie() > 0 && boss.getVie() > 0) {
			AsciiArt.hero_boss1();
			Combat.startCombat(player, boss);
		}
		System.out.println("Vous avez vaincu la horde et le chevalier a fuit le combat");
	}

}
