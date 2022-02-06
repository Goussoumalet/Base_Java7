package singleton;

public class Singleton {
	
	private static Singleton instance;//un champ static priv�
	
	public static Singleton getInstance() {
		if(instance==null)
			instance = new Singleton();
		    return instance;
	}

}
