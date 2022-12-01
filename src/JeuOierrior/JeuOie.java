package JeuOierrior;

public class JeuOie {
	private Oie[] oies; // TODO ArrayList<E>
	private int nbOie = 0;
	private Plateau plateau = new Plateau();
	private De des = new De();
	
	public JeuOie(int nbOieMax) {
		oies = new Oie[nbOieMax];
	}
	
	public void ajouterOie(String couleur) {
		if (nbOie < oies.length) {
			oies[nbOie] = new Oie(couleur, plateau, des);
			nbOie++;
		} else {
			System.out.println("\nTrop de oie dans la partie");
		}
	}
	public void jouer() {
		// TODO ...
	}

}
