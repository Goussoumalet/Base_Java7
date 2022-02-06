package arrayList8;

import java.util.*;

//Corrigez la classe suivante afin qu’elle soit
//compilée et que la méthode reverse renvoie un
//ArrayList contenant des entiers dans l’ordre inverse 
//de la liste des paramètres ArrayList.
//
//Exemple:
//[1, 2, 3, 4, 5, 6, 7]
//
//Sortie prévue:
//[7, 6, 5, 4, 3, 2, 1]


 public class Principale {
   
	 public static ArrayList reverse (ArrayList<Integer> liste) {
		 
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 
		 for(Integer i :liste) {
			 result.add(0, i);
		 }
		 return result;
	 }
	
	   
	    public static void main(String[] args)
	    {
	        ArrayList<Integer> liste = new ArrayList<Integer>();
			
	        int[] nbrs = {1, 2, 3, 4, 5, 6, 7};
			
	        for (int i = 0; i < nbrs.length; i++)
	        {
	            liste.add(nbrs[i]);
	        }
			
	        ArrayList<Integer> res = reverse(liste);
	        System.out.println(res);
	    }
	 
}
