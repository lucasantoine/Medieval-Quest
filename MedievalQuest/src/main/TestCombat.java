package main;

import Structure.Heros;
import combat.Combat;

public class TestCombat {
	public static void main(String[] args) {
		Combat.startCombat(new Heros(20, 10, 5, 10), new Heros(20, 10, 5, 10));
	}
}
