package encapsulation;

import java.util.Date;

public class Livre extends Document{

	private String titre;
	
	public Livre(String titre, String auteur) {
		super(auteur);
		this.titre = titre;
		
	}
	
	public String getTitre() {
		return titre;
	}
	
}

