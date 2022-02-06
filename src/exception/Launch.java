package exception;



//un  programme qui crée une exception
public class Launch {

	
	public static void main(String[] args) {
		
		//premier exemple d'exception
//		 String name = null;
//		 name.length();
	
// 2 eme exemple d'exception
		
//		int [] myArray = {1,2,3};
//		myArray[3] = 0;
		
	// recuperé les exceptions et les gérer
		
		String name = null;
		try {
			name.length();
		} catch(Exception e) {
			System.out.println("Error, Exception sur la taille de l'objet");
		}
		
		
		int [] myArray = {1,2,3};
		 try {
			 myArray[3] = 0;
		 } catch(Exception e) {
			 System.out.println("Error, Exception thrown");
		 }
		
       

        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
