package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import main.Game;
import util.IEvenement;

public class Auberge implements IEvenement{
	public static int gainVieDormir = 20;
	
	public static final Random R = new Random();
	
	
	public static void dormirAuberge(Personnage p) {
		int pv = p.getVie();
		p.getHud().setVie(pv + gainVieDormir);
		int tmp = R.nextInt(4);
		
		if(tmp == 1) {
			int argent = p.getArg();
			argent = argent /3 *2;
			p.getHud().setArgent(argent);
			System.out.println("\nVous vous �tes fait d�pouiller !");
			System.out.println("Vous perdez 1/3 de votre argent");
			
		}
		
		
		Saisie.pressEnter("\nVous avez gagn� 20 points de vie!\n", false);
		
		
		
		
	}
	
	public static void pillerAuberge(Personnage p) {
		int tmp = R.nextInt(3);
		
		if(tmp == 1) {
			if(p.getAtk() >= 15) {
				p.getHud().setVie(p.getVie()-2);
				System.out.println("\nLes propri�taires de l'auberge sont bien arm�s, mais vous �tes assez fort pour leur faire face !");
				Saisie.pressEnter("Vous ne perdez que 2pv\n", false);
				
			}
			if(p.getAtk() < 15) {
				int pv = p.getVie();
				p.getHud().setVie(pv-10);
				System.out.println("\nLes propri�taires de l'auberge �taient bien arm�s !");
				Saisie.pressEnter("Vous perdez 10 pv\n", false);
			}
			
			
			
		}
		
		if(tmp == 2 || tmp ==0) {
			int def = p.getDef();
			p.getHud().setDefense(def + 5); 
			System.out.println("\nVous avez trouv� un bouclier en bois !");
			Saisie.pressEnter("Vous avez gagn� 5 points de d�fense\n", false);
		}
	}
	
	public static void auberge(Personnage p) {
		Saisie.clearScreenOpti();
		System.out.println(Game.barAvancement);
		System.out.println(p.getHud());
		AsciiArt.hero_auberge();
		System.out.println("\nVous arrivez devant l'auberge. Que souhaitez-vous faire ?");
		System.out.println("   1. Dormir");
		System.out.println("   2. Piller");
		System.out.println("   3. Passer votre chemin\n");
		String s = Saisie.saisie("", 3);
		int choix = Saisie.stringToInt(s);
		
		
		Saisie.clearScreenOpti();
		AsciiArt.hero_auberge();
		if (choix ==1) {
			Auberge.dormirAuberge(p);
		}
		if (choix == 2) {
			Auberge.pillerAuberge(p);
		}
		if (choix ==3) {
			Saisie.pressEnter("\nVous avez pass� votre chemin.\n", false);
		}
		
		Saisie.clearScreenOpti();
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Heros p = new Heros();
		Auberge a = new Auberge();
		
		
	}
	

}
