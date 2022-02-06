package arrayList1;

import java.util.ArrayList;
import java.util.List;

//Écrivez un programme Java pour créer un ArrayList nommé 
//« languages », ajoutez des chaîne(Ex: PHP, Java, C++, Python) 
//et affichez la collection.

//Sortie prévue:
//[PHP, Java, C++, Python]

public class Main {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		//ArrayList list = new ArrayList();
		languages.add("PHP");
		languages.add("JAVA");
		languages.add("C++");
		languages.add("PYTHON");
		
		
		System.out.println("voici la sortie de votre arrayList: " +languages);

	}

}
