package objet_classe2;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int nombreDeDocs = Document.getCompteur();
		System.out.println("compteur=" +nombreDeDocs);
		
		
		//tableau en java
		Document[] lesDocs = new Document[5];
		int nbDocs = 0;
		
		lesDocs[nbDocs++]= new Document("Les 12 règles du cerveau", 504);
		lesDocs[nbDocs++]= new Document("Les dernières survivant de la caravane", 104);
		lesDocs[nbDocs++]= new Document("l'afrique est le berceau de l'humanité", 208);
		 
		
	    nombreDeDocs = Document.getCompteur();
		System.out.println("compteur=" +nombreDeDocs);
		
		for(int i=0; i< nbDocs; i++) {
		System.out.println(lesDocs[i].affiche());
		}
	}

}
