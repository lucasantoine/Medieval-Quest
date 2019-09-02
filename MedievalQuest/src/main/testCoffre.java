package main;

import Structure.Coffre;
import Structure.Heros;
import Structure.Personnage;

public class testCoffre {

	public static void main(String[] args) {
		Personnage p = new Heros();
		Coffre c = new Coffre();
		
		System.out.println(p.getHud().toString());
		c.ouvrirCoffre(p);
		System.out.println(p.getHud().toString());
	
	}

}



