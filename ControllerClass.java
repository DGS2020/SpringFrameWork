
public class ControllerClass {

	
	private ModelClass model;
	private ViewClass viewClass;
	
	public ControllerClass(ViewClass view, ModelClass model) {
		
		this.viewClass = view;
		this.model = model;
	}
	
	public void setStudentID(String id) {
		model.setStudentID(id);
	}
	
	public String getStudentID() {
		return model.getStudentID();
	}
	
	public void setStudentName(String name) {
		model.setStudentName(name);
	}
	
	public String getStudentName() {
		return model.getStudentName();
	}
	
	public void setStudentAddress(String studentAdress) {
		model.setStudentAddress(studentAdress);
	}
	
	public String getStudentAddress() {
		return model.getStudentAddress();
	}
	

public void updateStudent() {
	viewClass.printStudentDetails(model.getStudentID(), model.getStudentName(), model.getStudentAddress());
}
	
}
