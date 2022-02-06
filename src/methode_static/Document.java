package methode_static;

public class Document {

	@SuppressWarnings("unused")
	static private int compteur;
	
	public Document() {
		compteur ++;
	}
	
	static public int getCompteur() {
		return compteur;
	}
}
