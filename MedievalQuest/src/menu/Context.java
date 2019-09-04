package menu;

import interaction.Saisie;

public class Context {
	public static void showContext() {
		Saisie.pressEnter("     Dès qu'un message vous sera affiché,\n     vous pourrez le passer en appuyant sur ENTER,\n     et ce durant toute votre épopée.", true);
		
		if(Saisie.pressEnterToStartAndQToQuit("     Appuyez sur S si vous connaissez l'histoire de notre Royaume,\n     appuyez sur ENTER sinon : ", true, "s")) {
			//Si return true --> start sinon quit
			Saisie.pressEnter("     Bienvenue à \"Medieval Kingdom\" !", false);
			
			Saisie.pressEnter("     Ce royaume verdoyant est l'un des seul à vivre encore en paix.", false);
			Saisie.pressEnter("     Mais toute lumière à sa part d'ombre...", false);
			Saisie.pressEnter("     Cela fait 10 ans que tous les villageois vivent dans la peur.", false);
			Saisie.pressEnter("     \"Tartanpion\" ce nom rempli de terreur tout Homme des environs.", false);
			Saisie.pressEnter("     Nul ne sait d'où il vient mais une aura mystique entoure ce personnage craint de tous.", false);
			Saisie.pressEnter("     Je vous sais néanmoins assez courageux pour gravir les échelons.", false);
			Saisie.pressEnter("     Je vous sais assez pur pour rétablir l'ordre dans ce Royaume.", false);
			Saisie.pressEnter("     Je vous sais capable d'aller au bout... du MEDIEVAL QUEST !", false);
		}
	}
}
