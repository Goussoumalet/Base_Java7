package interface_java;

import java.util.Date;




public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//créer un objet date qui décrit l'heure actuelle
		  Date date = new Date();
		  
		  Bibliotheque biblio = new Bibliotheque("Gous biblio");		  
		  biblio.AjouterDocument("La conscience de soi","Gous");
		  biblio.AjouterDocument("La dernière survivante de la carvane",120);
		
		for(Object  doc: biblio) {
			//appel de polymorphisme
			System.out.println("docs :" +((Document)doc).getInfos());
			
	       }
		System.out.println("date :" +date);
    }	
	
}
