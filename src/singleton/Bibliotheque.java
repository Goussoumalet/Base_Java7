package singleton;

// creation de la classe bibliotheque avec singleton

public class Bibliotheque {

	private static Bibliotheque instance;
	
	//methode de creation de la classe
	public static Bibliotheque getInstance () {
		if(instance == null)
			//thread-safe
			synchronized(Bibliotheque.class) {
				if(instance == null)
				instance = new Bibliotheque();
			}
			
		    return instance;
	}
	 //désactiver la création d'un objet 
	  private Bibliotheque() {}
	  
	  //debarassé de l'objet
	  public static void Dispose() {
		  instance = null;
	  }
	
	  public void ajouteDocument(String title, String author) {
		  
	  }
	
	
}
