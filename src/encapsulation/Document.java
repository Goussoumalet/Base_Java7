package encapsulation;

public class Document {

	
	protected String auteur="";
	
	public Document (String auteur) {
		this.auteur = auteur;
		
	}
	
	public String getAuthor() {
		return auteur;
	}
	
}
