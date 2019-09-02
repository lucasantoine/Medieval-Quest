package interaction;

import java.util.Scanner;

public class Saisie {
	
	/**
	 * Verifie que la saisie est un chiffre compris entre 1 et la maxVal compris. 
	 * @param s
	 * @param maxVal
	 * @return boolean
	 */
	private static boolean saisieValide(String s, int maxVal) {
		boolean valide = false;
		
		if(s.length() == 1) {
			char c = s.charAt(0);
			
			int saisieToInt = c - '0';
			
			valide = saisieToInt > 0 && saisieToInt <= maxVal;
		}
		
		return valide;
	}
	
	/**
	 * Affiche le massageToShow
	 * Attends que l'utilisateur valide sa saisie en appuyant sur ENTER.
	 * Verifie si cette saisie est entre 1 et maxVal.
	 * Sinon il recommence à lui poser la question.
	 * @param messageToShow
	 * @param maxVal
	 * @return String
	 */
	public static String saisie(String messageToShow, int maxVal) {
		boolean valide = false;
		Scanner sc = new Scanner(System.in);
		String saisieUser = ""; 
		
		while (! valide) {
			if(messageToShow != null) {
				System.out.print(messageToShow);
			}
			saisieUser = sc.nextLine();
			
			valide = Saisie.saisieValide(saisieUser, maxVal);
		}

		sc.close();
		
		return saisieUser;
	}
	
	public static int stringToInt(String saisie) {
		int res = -1;
		
		if(saisie.length() >0) {	
			char firstChar = saisie.charAt(0);
		
			res = firstChar - 0;
		}
		
		return res;
	}
	
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		Saisie s = new Saisie();
		String saisie = s.saisie("Que faites vous (1, 2 ou 3) : ", 1);
		System.out.println("Vous avez saisie : " + saisie);
	}
}