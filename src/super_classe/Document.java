package super_classe;

public abstract class Document {

	
	private String title="";
	
	public Document (String title) {
		this.title = title;
		
	}
	
	public String getInfos() {
		return title;
	}
	
}
