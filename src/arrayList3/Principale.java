package arrayList3;

import java.util.*;

//Écrivez un programme Java pour insérer 
//l’élément « Pascal » en première position dans l’ArrayList.
//
//Exemple:
//[PHP, Java, C++, Python]
//
//Sortie prévue:
//[Pascal, PHP, Java, C++, Python]



public class Principale {

	public static void main(String[] args) {
		
		List<String> list3 = new ArrayList<String>();
		list3.add("PHP");
		list3.add("JAVA");
		list3.add("C++");
		list3.add("PYTHON");
		
    //inserer un élément dans la liste, 0 indique l'indice de l'element  
	// au debut de la liste
		list3.add(0,"PASCAL");
		
	System.out.println(list3);
	}

}
