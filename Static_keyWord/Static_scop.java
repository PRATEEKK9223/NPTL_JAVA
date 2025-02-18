package Static_keyWord;

class SCOP{
	static int var1;//it is also called class variable and it is loaded once when class is loaded into memory	
	 float var2;
	
	SCOP(int var1,float var2){
		SCOP.var1=var1;//here we use class name to diff from loal var to static var because static var belogs to class not a object
		this.var2=var2;//here we use this keyword to differentiate instance variable from local beacuse var belongs to object
	}
	
	
	
	static void Display() {
		System.out.println("var1= "+var1);	
	}
}

public class Static_scop {
	public static void main(String args[]) {
		SCOP obj =new SCOP(35,3.247f);
		//SCOP obj2=new SCOP(100,47.5f);
		
		SCOP.Display();
		System.out.println("var2= "+obj.var2);
				
	}

}
