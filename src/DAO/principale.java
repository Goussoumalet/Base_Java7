package DAO;

public class principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DocumentDAO doc = FabriquePersistance.createDocumentDAO();
		
		 Document d = doc.create();
	}

}
