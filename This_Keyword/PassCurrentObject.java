package This_Keyword;

class parent{
	public void display() {
		System.out.println("Inside parent class Display");
	}
	public void callDisplay() {
		this.display();
	}
}

class child extends parent{
	public void display() {
		System.out.println("inside child class display");
	}
	
}

public class PassCurrentObject {
	public static void main(String args[]) {
		parent obj=new child();
		obj.callDisplay();
	}

}
