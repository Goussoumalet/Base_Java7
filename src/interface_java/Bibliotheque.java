package interface_java;

import java.util.ArrayList;
import java.util.*;


public  class Bibliotheque implements Iterable{
	
	private String nom;
	
	// déclaration de cas de collection non generique 
	private List lesDocs = new ArrayList();
	private int indice=0;
	
	// constructeur de la classe bibliotheque
	public Bibliotheque(String nom) {
		this.nom = nom;
	}

	// les méthodes qui permets d'ajouter les documents
	 public void AjouterDocument(String title, String author) {
		 lesDocs.add(new Livre(title, author)) ;
	 }
	 public void AjouterDocument(String title, int nbPage) {
		 lesDocs.add(new Revue(title, nbPage));
	 }
	 

	@Override
	public Iterator iterator() {
		return lesDocs.iterator();
	}
}
