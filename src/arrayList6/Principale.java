package arrayList6;

import java.util.*;

//Écrivez un programme Java pour mettre à jour le 
//troisième élément de l’ArrayList par « COBOL ».
//Exemple: [PHP, Java, C++, Python]
//
//Sortie prévue:
//[PHP, Java, COBOL, Python]

public class Principale {

	public static void main(String[] args) {
		
      List<String> languages = new ArrayList<>();
      languages.add("PHP");
      languages.add("JAVA");
      languages.add("C++");
      languages.add("PYTHON");
      
      System.out.println(languages);
     
     		 
      // la fonction set() en java qui permet de mettre à jour
      //un élément de tableau
      
      languages.set(2, "COBOL");
      System.out.println("la mise à jour de langage C++:");
      System.out.println(languages);
      
	}

}
