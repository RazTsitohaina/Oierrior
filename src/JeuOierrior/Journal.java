package JeuOierrior;

public class Journal {
	private String message;
	
	public void ajouterMessage(String message) {
		this.message+=message;
	}
	
	public void afficherMessage() {
		System.out.println("\n"+this.message);
		this.message = "";
	}
}
