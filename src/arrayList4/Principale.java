package arrayList4;

import java.util.*;

//�crivez un programme Java pour r�cup�rer 
//le troisi�me �l�ment � partir d�un ArrayList.

//Exemple:[PHP,Java,C++,Python]
//Sortie pr�vue:Le troisi�me �l�ment:C++


public class Principale {

	public static void main(String[] args) {

		List<String> languages = new ArrayList<String>();
		languages.add("PHP");
		languages.add("JAVA");
		languages.add("C++");
		languages.add("PYTHON");
		
		//pour r�cup�rer un �l�ment dans la liste 
		// on utilise la m�thode get()
        
        System.out.println("voici le troisi�me �l�ment de la liste:" +languages.get(2));
	}

}
