package interaction;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.IEvenement;

public class Evenement {
	private List<IEvenement> list;
	
	public Evenement() {
		list = new ArrayList<>();
	}
	
	public Evenement(IEvenement... evenements) {
		this();
		for(IEvenement evenement : evenements)
			list.add(evenement);
	}
	
	public IEvenement getRandomEvent() {
		Collections.shuffle(list);
		return list.get(0);
	}
}
