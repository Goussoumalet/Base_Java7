package surcharge_methode;

public class Launch {
	
	//create a static method
		public static void affiche(String str) {
		  System.out.println(str);
			
		}
		
		//surcharge de methode
		public static void affiche(int ctr, String str) {
			for(int i = 0; i<ctr; i++) 
				 System.out.print(".");
				 System.out.println(str);
			 
			}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//appel à la méthode surchargée
	        affiche("je suis Tanguy");
	        affiche(2,"et j'habite à Avignon");
		}

}
