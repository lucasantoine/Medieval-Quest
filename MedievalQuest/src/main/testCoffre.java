package main;

import Structure.Coffre;
import Structure.Heros;
import Structure.Personnage;

public class testCoffre {

	public static void main(String[] args) {
		Personnage p = new Heros();
		
		System.out.println(p.getHud().toString());
		System.out.println(p.getImage() + "\n" + Coffre.getImage());
		Coffre.ouvrirCoffre(p);
		System.out.println(p.getHud().toString());
		System.out.println(p.getImage() + "\n" + 
		Coffre.getImage());
	
	}

}


