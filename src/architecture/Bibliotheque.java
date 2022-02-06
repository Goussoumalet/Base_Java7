package architecture;


public class Bibliotheque {
	
	private String nom;
	private Document[] lesDocs = new Document[5];
	private int nbDocs = 0;
	
	
	public Bibliotheque(String nom) {
		nom= nom;
	}
	
	public int getCompteur() {
		return Document.getCompteur();
	}
 
	 public void ajouteDocument(String titre, int nbPages) {
		lesDocs[nbDocs++]= new Document(titre, nbPages);
		
	 }
	 
	  public String affiche() {
		  String ret = "";
		 for(int i=0; i< nbDocs; i++) {
			 ret += lesDocs[i].affiche()+'\n';
		 }
		  return ret;
	 }
}
