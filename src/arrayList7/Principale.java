package arrayList7;

import java.util.ArrayList;
import java.util.List;

//�crivez un programme Java pour supprimer le troisi�me �
//l�ment d�un ArrayList.
//
//Exemple: [PHP, Java, C++, Python]
//
//Sortie pr�vue:
//[PHP, Java, Python]


public class Principale {

	public static void main(String[] args) {
		
	      List<String> languages = new ArrayList<>();
	      languages.add("PHP");
	      languages.add("JAVA");
	      languages.add("C++");
	      languages.add("PYTHON");
	      
	      System.out.println(languages);
	     
	     		 
	      // la fonction remove() en java qui permet de supprimer
	      //un �l�ment de tableau
	      
	      languages.remove(2);
	      
	      System.out.println("voici le reste de tableau :" +languages);
	      
		}
}
