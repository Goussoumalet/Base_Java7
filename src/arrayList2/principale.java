package arrayList2;

import java.util.*;

//�crivez un programme Java pour parcourir tous les �l�ments 
//d�un ArrayList, en utilisant la boucle for

//Sortie pr�vue:
//PHP
//Java
//C++
//Python


public class principale {
	
	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		
		languages.add("PHP");
		languages.add("JAVA");
		languages.add("C++");
		languages.add("PYTHON");

		 for(String lang : languages) {
			 System.out.println(lang);
		 }
		
	}
	

}
