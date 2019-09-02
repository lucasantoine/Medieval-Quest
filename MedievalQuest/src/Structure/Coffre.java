package Structure;

import java.util.ArrayList;
import java.util.Random;

public class Coffre {
	public static final Random R = new Random();
	public ArrayList<String> stat = new ArrayList<>();
	
	public Coffre() {
		this.stat.add("Vie");
		this.stat.add("Atk");
		this.stat.add("Def");
		this.stat.add("$");
	}
	
	public void ouvrirCoffre(Personnage p) {
		int tmp = R.nextInt(4);
		if(this.bonus()) {
			System.out.println("Vous gagnez 10 "+p.getHud().getStats()[tmp].getUnite());
			p.getHud().getStats()[tmp].add(10);
		} else {
			System.out.println("Vous perdez 5 "+p.getHud().getStats()[tmp].getUnite());
			p.getHud().getStats()[tmp].add(-5);
		}
		System.out.println();
		System.out.println("Appuyez sur <Entrée> pour continuer.");
	}
	
	public boolean bonus() {
		return R.nextInt(2)==1;
	}
	
	public static void main(String[] args) {
		Coffre c = new Coffre();
		c.ouvrirCoffre(new Heros());
	}
}