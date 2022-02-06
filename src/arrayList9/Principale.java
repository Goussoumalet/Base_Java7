package arrayList9;

import java.util.*;


//Écrivez un programme Java pour rechercher 
//un élément dans un ArrayList Ex: [PHP, Java, C++, Python].
//
//Exemple:   Java
//
//Sortie prévue:
//L’élément existe dans la liste




public class Principale {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		languages.add("PHP");
		languages.add("JAVA");
		languages.add("C++");
		languages.add("PYTHON");

		// méthode contains() en java est utilise ppour déterminer  
		// la présence d'un élément dans un tableau.
		if(languages.contains("JAVA")) {
			System.out.println("L’élément existe dans la liste");
		} else {
			System.out.println("L’élément n'existe pas dans la liste");
		}
		
	}

}
