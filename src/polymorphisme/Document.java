package polymorphisme;

public class Document {

	
	protected String title="";
	
	public Document (String title) {
		this.title = title;
		
	}
	
	public String getInfos() {
		return title;
	}
	
}
