package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import util.IEvenement;

public class Coffre implements IEvenement{
	public static final String BKN = System.getProperty("line.separator");
	
	public static final Random R = new Random();

	private static String image = "       ____...------------...____"
			+ BKN + "  _.-\"` /o/__ ____ __ __  __ \\o\\_`\"-._"
			+ BKN + ".'     / /                    \\ \\     '."
			+ BKN + "|=====/o/======================\\o\\=====|"
			+ BKN + "|____/_/________..____..________\\_\\____|"
			+ BKN + "/   _/ \\_     <_o#\\__/#o_>     _/ \\_   \\"
			+ BKN + "\\_________       \\####/       _________/"
			+ BKN + " |===\\!/========================\\!/===|"
			+ BKN + " |   |=|          .---.         |=|   |"
			+ BKN + " |===|o|=========/     \\========|o|===|"
			+ BKN + " |   | |         \\() ()/        | |   |"
			+ BKN + " |===|o|======{'-.) A (.-'}=====|o|===|"
			+ BKN + " | __/ \\__     '-.\\uuu/.-'    __/ \\__ | "
			+ BKN + " |====          .'.'^'.'.         ====|"
			+ BKN + " |_\\o/     __  {.' __  '.}  __    \\o/_|"
			+ BKN + " `\"\"\"\"-\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"-\"\"\"\"`";
	
	public static void coffre(Personnage p) {
		System.out.println(p.getHud());
		System.out.println("Vous arrivez en face d'un coffre. Voulez vous prendre le risque de l'ouvrir, ou allez vous passer votre chemin ?");
		AsciiArt.hero_coffre();
		String s = Saisie.saisie("Faites un choix (1 - ouvrir, 2 - partir) : \n", 2);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		if(choix == 1) {
			Coffre.ouvrirCoffre(p);
		}
		System.out.println(p.getHud());
	}
	
	private static void ouvrirCoffre(Personnage p) {
		int tmp = R.nextInt(4);
		if(Coffre.bonus()) {
			System.out.println("Vous gagnez 10 "+p.getHud().getStats()[tmp].getStat().getSymbole());
			p.getHud().getStats()[tmp].add(10);
		} else {
			System.out.println("Vous perdez 5 "+p.getHud().getStats()[tmp].getStat().getSymbole());
			p.getHud().getStats()[tmp].add(-5);
		}
		System.out.println();
		System.out.println();
		Saisie.pressEnter("Appuyez sur <Entrée> pour continuer.", false);
	}
	
	private static boolean bonus() {
		return R.nextInt(2)==1;
	}

	public static String getImage() {
		return image;
	}
}