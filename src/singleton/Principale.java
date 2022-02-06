package singleton;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bibliotheque.getInstance().ajouteDocument("La dernière survivante de la caravane",
    		  "ETienne Goyomidé" );
      Bibliotheque.getInstance().ajouteDocument("La conscience de soi","Damasio");
    		 
      
      Bibliotheque.Dispose();
	}

}
