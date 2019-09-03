package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;

public class Auberge {
	public static int gainVieDormir = 20;
	
	public static final Random R = new Random();
	
	
	
	
	
	public void getImage() {
		AsciiArt.auberge();
	}
	
	public static void dormirAuberge(Personnage p) {
		int pv = p.getVie();
		p.getHud().setVie(pv + gainVieDormir);
		int tmp = R.nextInt(4);
		
		if(tmp == 1) {
			int argent = p.getArg();
			argent = argent /3 *2;
			p.getHud().setArgent(argent);
			System.out.println("Vous vous êtes fait dépouiller !");
			
		}
		
		//System.out.println("Vous avez gagné 20 points de vie!")
		Saisie.pressEnter("Vous avez gagné 20 points de vie!", false);
		
		
		
		
	}
	
	public static void pillerAuberge(Personnage p) {
		int tmp = R.nextInt(3);
		
		if(tmp == 1) {
			int pv = p.getVie();
			p.getHud().setVie(pv-10);
			System.out.println("Les propriétaires de l'auberge étaient bien armés !");
			//System.out.println("Vous perdez 10 pv");
			Saisie.pressEnter("Vous perdez 10 pv", false);
		}
		
		if(tmp == 2 || tmp ==0) {
			int def = p.getDef();
			p.getHud().setDefense(def + 5); 
			System.out.println("Vous avez trouvé un bouclier en bois !");
			//System.out.println("Vous avez gagné 5 points de défense");
			Saisie.pressEnter("Vous avez gagné 5 points de défense", false);
		}
	}
	
	public static void auberge(Personnage p) {
		//System.out.println(p.getHud());
		AsciiArt.auberge();
		System.out.println("Vous arrivez devant l'auberge. Que souhaitez-vous faire ?");
		System.out.println("   1. Dormir");
		System.out.println("   2. Piller");
		System.out.println("   3. Passer votre chemin");
		String s = Saisie.saisie("", 3);
		int choix = Saisie.stringToInt(s);
		
		System.out.println(choix);
		
		Saisie.clearScreenOpti();
		if (choix ==1) {
			Auberge.dormirAuberge(p);
		}
		if (choix == 2) {
			Auberge.pillerAuberge(p);
		}
		if (choix ==3) {
			System.out.println("Vous avez passé votre chemin.");
		}
		
		System.out.println(p.getHud());
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Heros p = new Heros();
		Auberge a = new Auberge();
		
		
	}
	

}
