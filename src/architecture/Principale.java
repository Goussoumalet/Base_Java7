package architecture;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Bibliotheque bib = new Bibliotheque("B2B biblio");
		int nombreDeDocs = bib.getCompteur();
		
		bib.ajouteDocument("Les 12 r�gles du cerveau", 504);
		bib.ajouteDocument("Les derni�res survivant de la caravane", 104);
		bib.ajouteDocument("l'afrique est le berceau de l'humanit�", 208);
		 
		
	    nombreDeDocs = bib.getCompteur();
		System.out.println("compteur=" +nombreDeDocs);
		System.out.println(bib.affiche());
		
	  }
	
	
}
