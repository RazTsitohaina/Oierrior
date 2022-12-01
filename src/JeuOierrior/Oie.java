package JeuOierrior;

public class Oie {
	private String couleur;
	
	public De deOie;
	public Journal journal_Oie;
	public Case casePlateau;
	public Plateau plateau;
	
	public Oie(String couleur, Plateau plateau,De de) {
		this.couleur = couleur;
		this.plateau = plateau;
		this.deOie = de;
		this.casePlateau = this.plateau.donnerCase(0);
	}
	
	public String getCouleur() {
		return this.couleur;
	}
}
