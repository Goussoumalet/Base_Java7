package arrayList7;

import java.util.ArrayList;
import java.util.List;

//Écrivez un programme Java pour supprimer le troisième é
//lément d’un ArrayList.
//
//Exemple: [PHP, Java, C++, Python]
//
//Sortie prévue:
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
	      //un élément de tableau
	      
	      languages.remove(2);
	      
	      System.out.println("voici le reste de tableau :" +languages);
	      
		}
}
