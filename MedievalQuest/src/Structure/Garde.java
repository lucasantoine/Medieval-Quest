package Structure;

import java.util.Random;

public class Garde {
	public static final String BKN = System.getProperty("line.separator");
	public static final Random R = new Random();

	
	public static void getChoix(int choix, Personnage p) {
		switch(choix) {
		case 1 : Garde.seduire(p); break;
		case 2 : Garde.payer(p); break;
		case 3 : Garde.intimider(p); break;
		case 4 : Garde.fuir(p); break;
		default:;break;
		}
	}
	
	private static void seduire(Personnage p) {
		System.out.println("Vous tentez de séduire le garde.");
		if(R.nextInt(2)==1) {
			System.out.println("Il semble intéressé par vous et souhaite vous revoir ce soir. Il vous glisse un morceau de papier dans votre poche arrière et vous laisse passer.");	
		} else {
			System.out.println("Vous pensiez vraiment pouvoir séduire un garde ? Vexé, il vous frappe au visage et vous vole 5 pièces d'or.");
			p.getHud().getStats()[0].add(-5);
			p.getHud().getStats()[3].add(-5);
		}
	}
	
	private static void payer(Personnage p) {
		System.out.println("Vous tentez de payer le garde.");
		if(p.getArg()>=20) {
			System.out.println("Il accepte avec avidité et vous laisse poursuivre votre aventure.");
			p.getHud().getStats()[3].add(-5);
		} else {
			System.out.println("Il refuse, voyant votre bourse vide, et décide de se calmer en se défoulant sur vous.");
			p.getHud().getStats()[0].add(-5);
		}
	}
	
	private static void intimider(Personnage p) {
		System.out.println("Vous décidez de jouer des muscles afin d'intimider le garde.");
		if(p.getAtk()>=20) {
			System.out.println("Le garde, apeuré, s'enfuit en courant en laissant tomber sa bourse sur le sol.");
			p.getHud().getStats()[3].add(10);
		} else {
			System.out.println("Le garde, nullement impressionné par votre numéro, vous met une baffe dont vous vous souviendrez toute votre vie.");
			p.getHud().getStats()[0].add(-5);
		}
	}
	
	
	
	private static void fuir(Personnage p) {
		System.out.println("Vous prenez la fuite !");
		System.out.println("Pensiez-vous vraiment pouvoir échapper à un garde ? Il vous rattrappe aisément et vous plante son épée dans la jambe.");
		p.getHud().getStats()[0].add(-10);
	}
	
	
	public static void main(String[] args) {
		Heros h = new Heros();
		h.getHud().getStats()[3].add(100);
		System.out.println(h.getHud().toString());
		Garde.getChoix(2, h);
		System.out.println(h.getHud().toString());
	}
	

}
