package This_Keyword;

public class fst{
	int age=19;
	String name="Prateek";
	
	public fst(int age,String name) {
		age=age;
		name=name;
		System.out.println(age);    
  		System.out.println(name);   
}
	
	public fst(int age) {
		this();
		//this(1000,"Lohith");
		this.age=age;
		this.name="shidramayya";
		System.out.println(age);
		System.out.println(name);    
	}
	
	public fst(){
	age=2000;
	name="Govinda";
	System.out.println(age);     
	System.out.println(name);    }
	
	public  void modified(int age,String name) {
		this.age=age;
		this.name=name;
		System.out.println(age);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		fst obj1=new fst(200);
		fst obj2=new fst(15,"Vihan"); 
		
		                               
		obj1.modified(100,"God");      
		
		obj2.modified(100,"God");
	}
	
	
}