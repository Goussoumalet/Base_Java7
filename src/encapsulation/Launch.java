package encapsulation;

import java.util.Date;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cr�er un objet date qui d�crit l'heure actuelle
		  Date date = new Date();
		  
		Livre monLivre = new Livre("La conscience de soi","Gous");
		System.out.println("titre :" +monLivre.getTitre());
		System.out.println("auteur :" +monLivre.getAuthor());
		System.out.println("date :" +date);
	}

}
