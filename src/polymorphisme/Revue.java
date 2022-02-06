package polymorphisme;

public class Revue extends Document {
   
	int nbPages ;
	
	public Revue(String auteur, int nbPages) {
		super(auteur);
		this.nbPages = nbPages;
		
	}

	@Override
	public String getInfos() {
		return super.getInfos() + "  en  " +nbPages + " Pages ";
	}
}
