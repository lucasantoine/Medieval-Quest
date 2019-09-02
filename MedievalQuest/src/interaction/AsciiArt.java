package interaction;

public class AsciiArt {

	public static final String BKN = System.getProperty("line.separator");
	
	public static void mendiant() {
		System.out.println("        _,._" + BKN + "      ,'   ,`-." + BKN + "     /     |\\  `." + BKN + "    (  ,-,-` ). `-._ __" + BKN + "     \\|\\,'     `\\  /'  `\\" + BKN + "      ` |, ,  /  \\ \\     \\" + BKN + "          `,_/`, /\\,`-.__/`." + BKN + "              | ` /    /    `-._" + BKN + "              `-/'    /         `-." + BKN + "   ;  _______,-/_   /'             \\" + BKN + "---'`|       |`  ),' `---.  ,       |" + BKN + " \\..-`--..___|_,/          /       /" + BKN + "            |    |`,-,...,/      ,'	" + BKN + "            \\    | |_|   /     ,' __  r-''," + BKN + "             |___|/  |, /  __ /-''  `'`)  |" + BKN + "          _,-'   ||__\\ /,-' /     _,.--|  (" + BKN + "       .-'       )   `(_   / _,.-'  ,-' _,/" + BKN + "        `-------'       `--''       `'''");
	}
	
	public static void hero() {
		System.out.println(" /\\" + BKN + " ||" + BKN + " ||" + BKN + " ||" + BKN + " ||           {}" + BKN + " ||          .--." + BKN + " ||         /.--.\\" + BKN + " ||         |====|" + BKN + " ||         |`::`|" + BKN + "_||_    .-;`\\..../`;_.-^-._" + BKN + " /\\\\   /  |...::..|`   :   `|" + BKN + " |:'\\ |   /'''::''|   .:.   |" + BKN + "  \\ /\\;-,/\\   ::  |..:::::..|" + BKN + "   \\ <` >  >._::_.| ':::::' |" + BKN + "    `\"\"`  /   ^^  |   ':'   |" + BKN + "          |       \\    :    /" + BKN + "          |        \\   :   /" + BKN + "          |___/\\___|`-.:.-`" + BKN + "           \\_ || _/" + BKN + "           <_ >< _>" + BKN + "           |  ||  |" + BKN + "           |  ||  |" + BKN + "          _\\.:||:./" + BKN + "         /____/\\____\\");
	}
	
	public static void main(String[] args) {
		//AsciiArt.mendiant();
		AsciiArt.hero();
	}
}