package arrayList4;

import java.util.*;

//Écrivez un programme Java pour récupérer 
//le troisième élément à partir d’un ArrayList.

//Exemple:[PHP,Java,C++,Python]
//Sortie prévue:Le troisième élément:C++


public class Principale {

	public static void main(String[] args) {

		List<String> languages = new ArrayList<String>();
		languages.add("PHP");
		languages.add("JAVA");
		languages.add("C++");
		languages.add("PYTHON");
		
		//pour récupérer un élément dans la liste 
		// on utilise la méthode get()
        
        System.out.println("voici le troisième élément de la liste:" +languages.get(2));
	}

}
