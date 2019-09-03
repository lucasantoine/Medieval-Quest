package Structure;

import java.util.Random;

public class Coffre {
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
	
	public static void ouvrirCoffre(Personnage p) {
		int tmp = R.nextInt(4);
		if(Coffre.bonus()) {
			System.out.println("Vous gagnez 10 "+p.getHud().getStats()[tmp].getStat().getSymbole());
			p.getHud().getStats()[tmp].add(10);
		} else {
			System.out.println("Vous perdez 5 "+p.getHud().getStats()[tmp].getStat().getSymbole());
			p.getHud().getStats()[tmp].add(-5);
		}
		System.out.println();
		System.out.println("Appuyez sur <Entrée> pour continuer.");
	}
	
	private static boolean bonus() {
		return R.nextInt(2)==1;
	}

	public static String getImage() {
		return image;
	}
}