package super_classe;

import java.util.Date;




public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cr�er un objet date qui d�crit l'heure actuelle
		  Date date = new Date();
		  
		  Document [] lesDocs = new Document[5];
		  
		lesDocs[0]= new Livre("La conscience de soi","Gous");
		lesDocs[1]= new Revue("La derni�re survivante de la carvane",120);
		
		for(int i=0; i<2; i++) {
			//appel de polymorphisme
			System.out.println("docs :" +lesDocs[i].getInfos());
			
	       }
		System.out.println("date :" +date);
    }	
	
}
