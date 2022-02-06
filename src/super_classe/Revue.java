package super_classe;

public class Revue extends Document {
   
	int nbPages ;
	
	public Revue(String title, int nbPages) {
		super(title);
		this.nbPages = nbPages;
		
	}

	@Override
	public String getInfos() {
		return super.getInfos() + "  en  " +nbPages + " Pages ";
	}
}
