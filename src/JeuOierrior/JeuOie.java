package JeuOierrior;

public class JeuOie {
	private Oie[] oies; // TODO ArrayList<E>
	private int nbOie = 0;
	private Plateau plateau = new Plateau();
	private De de = new De();
	
	public JeuOie(int nbOieMax) {
		oies = new Oie[nbOieMax];
	}
	public void ajouterOie(String couleur) {
		if (nbOie < oies.length) {
			oies[nbOie] = new Oie(couleur, plateau, des);
			nbOie++;
		} else {
			// TODOelseajouteroie
		}
	}
	public void jouer() {
		// TODO ...
	}

}
