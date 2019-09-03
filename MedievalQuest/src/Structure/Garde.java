package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import util.IEvenement;

public class Garde implements IEvenement {
	public static final String BKN = System.getProperty("line.separator");
	public static final Random R = new Random();

	
	public static void garde(Personnage p) {
		System.out.println(p.getHud());
		AsciiArt.hero_garde();
		System.out.println("Vous arrivez en face d'un garde menacant.");
		String s = Saisie.saisie("Que souhaitez vous faire ? (1 - Le séduire, 2 - Le soudoyer, 3 - L'intimider, 4 - Fuir) : \n", 4);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		Garde.getChoix(choix, p);
	}
	
	
	
	private static void getChoix(int choix, Personnage p) {
		switch(choix) {
		case 1 : Garde.seduire(p); break;
		case 2 : Garde.payer(p); break;
		case 3 : Garde.intimider(p); break;
		case 4 : Garde.fuir(p); break;
		default: break;
		}
	}
	
	private static void seduire(Personnage p) {
		Saisie.pressEnter("Vous tentez de séduire le garde.", false);
		if(R.nextInt(2)==1) {
			Saisie.pressEnter("Il semble intéressé par vous et souhaite vous revoir ce soir. Il vous glisse un morceau de papier dans votre poche arrière et vous laisse passer.", false);	
		} else {
			Saisie.pressEnter("Vous pensiez vraiment pouvoir séduire un garde ? Vexé, il vous frappe au visage et vous vole 5 pièces d'or.", false);
			Saisie.pressEnter("Vous perdez 5 points de vie.", true);
			p.getHud().getStats()[0].add(-5);
			p.getHud().getStats()[3].add(-5);
		}
	}
	
	private static void payer(Personnage p) {
		Saisie.pressEnter("Vous tentez de payer le garde.", false);
		if(p.getArg()>=20) {
			Saisie.pressEnter("Il accepte avec avidité et vous laisse poursuivre votre aventure.", false);
			Saisie.pressEnter("Vous perdez 5$.", true);
			p.getHud().getStats()[3].add(-5);
		} else {
			Saisie.pressEnter("Il refuse, voyant votre bourse vide, et décide de se calmer en se défoulant sur vous.", false);
			Saisie.pressEnter("Vous perdez 5 points de vie.", true);
			p.getHud().getStats()[0].add(-5);
		}
	}
	
	private static void intimider(Personnage p) {
		Saisie.pressEnter("Vous décidez de jouer des muscles afin d'intimider le garde.", false);
		if(p.getAtk()>=20) {
			Saisie.pressEnter("Le garde, apeuré, s'enfuit en courant en laissant tomber sa bourse sur le sol.", false);
			Saisie.pressEnter("Vous gagnez 10$.", true);
			p.getHud().getStats()[3].add(10);
		} else {
			Saisie.pressEnter("Le garde, nullement impressionné par votre numéro, vous met une baffe dont vous vous souviendrez toute votre vie.", false);
			Saisie.pressEnter("Vous perdez 5 points de vie.", true);
			p.getHud().getStats()[0].add(-5);
		}
	}
	
	
	
	private static void fuir(Personnage p) {
		Saisie.pressEnter("Vous prenez la fuite !", false);
		Saisie.pressEnter("Pensiez-vous vraiment pouvoir échapper à un garde ? Il vous rattrappe aisément et vous plante son épée dans la jambe.", false);
		Saisie.pressEnter("Vous perdez 10 points de vie.", true);
		p.getHud().getStats()[0].add(-10);
	}
}
