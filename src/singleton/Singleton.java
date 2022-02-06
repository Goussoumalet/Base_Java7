package singleton;

public class Singleton {
	
	private static Singleton instance;//un champ static privé
	
	public static Singleton getInstance() {
		if(instance==null)
			instance = new Singleton();
		    return instance;
	}

}
