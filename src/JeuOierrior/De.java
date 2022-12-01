package JeuOierrior;

import java.util.Random;

public class De {
	private static Random r ;
	
	public int lancer() {
		r = new Random();
		int nombre;
		nombre = 1+r.nextInt(6-1);
		return nombre;
	}
}
