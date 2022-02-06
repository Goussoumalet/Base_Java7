package objet_classe;

public class Document {
	
	private String titre;
	private int nbPages;
	static private int compteur = 0;
	//constructeur de la classe
	public Document(String titre, int nbPages) {
		this.titre = titre;
		this.nbPages = nbPages;
		compteur ++;
	}
     public  static int getCompteur() {
    	  return compteur;
      }
	
	 public String affiche() {
		 return "titre : "+getTitre()+ "nbpages : " +getNbPages();
	 }
	 
	 public String getTitre() {
		 return titre;
		 
	 }
	 
	 public int getNbPages() {
		 return nbPages;
		 
	 }
	
}
