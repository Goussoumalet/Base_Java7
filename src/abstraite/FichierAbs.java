package abstraite;

public  abstract class FichierAbs {

	String nom;
	
	public FichierAbs(String nom) {
		this.nom = nom;
	}
	
	
	protected abstract void ecrireEntete();
	protected abstract void ecrireData();
	
	//methode template
	 public void compresser() {
		 //ecrire l'entete
		 ecrireEntete();
		 //ecrire les données
		  ecrireData();
	   }
		 
	
}
