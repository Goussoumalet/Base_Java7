package interface_java;

import java.util.Date;




public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cr�er un objet date qui d�crit l'heure actuelle
		  Date date = new Date();
		  
		  Bibliotheque biblio = new Bibliotheque("Gous biblio");		  
		  biblio.AjouterDocument("La conscience de soi","Gous");
		  biblio.AjouterDocument("La derni�re survivante de la carvane",120);
		
		for(Object  doc: biblio) {
			//appel de polymorphisme
			System.out.println("docs :" +((Document)doc).getInfos());
			
	       }
		System.out.println("date :" +date);
    }	
	
}
