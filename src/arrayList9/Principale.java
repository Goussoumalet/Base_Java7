package arrayList9;

import java.util.*;


//�crivez un programme Java pour rechercher 
//un �l�ment dans un ArrayList Ex: [PHP, Java, C++, Python].
//
//Exemple:   Java
//
//Sortie pr�vue:
//L��l�ment existe dans la liste




public class Principale {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		languages.add("PHP");
		languages.add("JAVA");
		languages.add("C++");
		languages.add("PYTHON");

		// m�thode contains() en java est utilise ppour d�terminer  
		// la pr�sence d'un �l�ment dans un tableau.
		if(languages.contains("JAVA")) {
			System.out.println("L��l�ment existe dans la liste");
		} else {
			System.out.println("L��l�ment n'existe pas dans la liste");
		}
		
	}

}
