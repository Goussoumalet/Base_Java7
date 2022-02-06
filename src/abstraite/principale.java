package abstraite;

public class principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fichier fich = new Fichier("Toto.txt");
 
		fich.compresser();
        System.out.println("voici votre fichier :" +fich);
	}

}
