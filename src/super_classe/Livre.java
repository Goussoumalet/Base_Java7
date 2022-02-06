package super_classe;

import java.util.Date;

public class Livre extends Document{

	private String author;
	
	public Livre(String title, String author) {
		super(title);
		this.author = author;
		
	}
	
	@Override
	public String getInfos() {
		return super.getInfos() + " de "+ author;
	}
	
}

