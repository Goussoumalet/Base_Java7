package leveException;
public class Launcher {

	public static void main(String[] args)  {
		for(int i=0; i<10; i++) {
			
			if(i== 5) {
				//lancer une exception
				try {
					throw new MyException(); // l'exception est lance ici
				}catch(MyException e){
					e.printStackTrace();
					
				}
				
			}
		}

	}

}
