package JeuOierrior;

public class Plateau {
	private static int NB_CASES = 63;
	private Case cases[];
	
	public Plateau() {
		this.cases = new Case[NB_CASES];
		for (int i=0; i<NB_CASES -1; i++) {
			Case N_case = new Case(i);
			this.cases[i] = N_case;
		}
	}
	
	public Case donnerCase(int nb_case) {
		return this.cases[nb_case];
	}
	
	public Case caseDebutPartie() {
		return this.cases[0];
	}
}
