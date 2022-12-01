package JeuOierrior;

public class Case {
	private int numCase;
	
	public Case(int numCase) {
		this.numCase = numCase;
	}
	
	public int getNum() {
		return this.numCase;
	}
	
	public String getNom() {
		return " numero "+this.numCase;
	}
	
	public Case depart(Oie oie) {
		return oie.casePlateau;
	}
	
	public Case arrivee(Oie oie) {
		oie.journal+=oie.casePlateau
	}
	
	protected Case caseSuivante(Oie oie, int numCaseDestination) {
		
	}
}
