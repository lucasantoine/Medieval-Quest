package Structure;

public class Heros extends Personnage {
	public static final String BKN = System.getProperty("line.separator");
	private String image = " /\\" 
			+ BKN + " ||"
			+ BKN + " ||"
			+ BKN + " ||"
			+ BKN + " ||           {}"
			+ BKN + " ||          .--."
			+ BKN + " ||         /.--.\\"
			+ BKN + " ||         |====|"
			+ BKN + " ||         |`::`|"
			+ BKN + "_||_    .-;`\\..../`;_.-^-._"
			+ BKN + " /\\\\   /  |...::..|`   :   `|"
			+ BKN + " |:'\\ |   /'''::''|   .:.   |"
			+ BKN + "  \\ /\\;-,/\\   ::  |..:::::..|"
			+ BKN + "   \\ <` >  >._::_.| ':::::' |"
			+ BKN + "    `\"\"`  /   ^^  |   ':'   |"
			+ BKN + "          |       \\    :    /"
			+ BKN + "          |        \\   :   /"
			+ BKN + "          |___/\\___|`-.:.-`"
			+ BKN + "           \\_ || _/"
			+ BKN + "           <_ >< _>"
			+ BKN + "           |  ||  |"
			+ BKN + "           |  ||  |"
			+ BKN + "          _\\.:||:./"
			+ BKN + "         /____/\\____\\";
	
	
	public Heros(int vie, int atk, int def, int arg) {
		super(vie, atk, def, arg);	
	}
	
	public Heros() {
		super();
	}
	
	public String getImage() {
		return image;
	}
	
	
}
