package arrayList6;

import java.util.*;

//�crivez un programme Java pour mettre � jour le 
//troisi�me �l�ment de l�ArrayList par � COBOL �.
//Exemple: [PHP, Java, C++, Python]
//
//Sortie pr�vue:
//[PHP, Java, COBOL, Python]

public class Principale {

	public static void main(String[] args) {
		
      List<String> languages = new ArrayList<>();
      languages.add("PHP");
      languages.add("JAVA");
      languages.add("C++");
      languages.add("PYTHON");
      
      System.out.println(languages);
     
     		 
      // la fonction set() en java qui permet de mettre � jour
      //un �l�ment de tableau
      
      languages.set(2, "COBOL");
      System.out.println("la mise � jour de langage C++:");
      System.out.println(languages);
      
	}

}
