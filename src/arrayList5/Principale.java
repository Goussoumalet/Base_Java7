package arrayList5;

import java.util.*;

//Corrigez le code suivant afin qu’il compile. 
//Le code doit instancier un ArrayList de String nommée 
//‘persons’ et la remplir avec les chaînes du tableau ’employee’. 
//Il devrait ensuite afficher les ‘persons’.


public class Principale {

	public static void main(String[] args) {
		List<String> persons = new ArrayList<String>();
		String [] employee = {"Alex", "Thomas", "Bob","Yohan"};
		
		for(int i = 0; i< employee.length; i++) {
			persons.add(employee[i]);
		}
		System.out.println(persons);

	}

}
