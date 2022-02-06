package DAO;

public interface DocumentDAO {

	
	//... proposer le CRUD
	
	Document create(); // pour créer un document
	Document recove(long ID); //pour recupéré un document
	Document modify(Document doc); //pour modifier un document
	Document delete(Document doc);  // pour supprimer un document
}
