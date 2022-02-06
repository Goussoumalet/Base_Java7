package DAO;

public interface DocumentDAO {

	
	//... proposer le CRUD
	
	Document create(); // pour cr�er un document
	Document recove(long ID); //pour recup�r� un document
	Document modify(Document doc); //pour modifier un document
	Document delete(Document doc);  // pour supprimer un document
}
