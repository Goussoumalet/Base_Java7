package interface_java;

public abstract class Document {

	
	private String title="";
	
	public Document (String title) {
		this.title = title;
		
	}
	
	public String getInfos() {
		return title;
	}
	
}
