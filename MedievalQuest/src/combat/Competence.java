package combat;

import Structure.Personnage;
import util.EStat;
import util.Effet;

public class Competence {
	private String name;
	private EStat statUtile;
	
	public Competence(String name, EStat statUtile) {
		this.name = name;
		this.statUtile = statUtile;
	}
}
