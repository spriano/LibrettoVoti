package it.start.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto() {
		voti = new ArrayList<Voto>();
	}
	
	public void add(Voto v) {
		voti.add(v);
	}

}
