package arrayList1;

import java.util.ArrayList;
import java.util.List;

//�crivez un programme Java pour cr�er un ArrayList nomm� 
//� languages �, ajoutez des cha�ne(Ex: PHP, Java, C++, Python) 
//et affichez la collection.

//Sortie pr�vue:
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
