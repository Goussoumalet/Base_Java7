package DAO;

public class FabriquePersistance {

	public static DocumentDAO createDocumentDAO() {
		return  new OracleDocumentDAO();
	}
	
}
