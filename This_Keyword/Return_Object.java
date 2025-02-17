package This_Keyword;

public class Return_Object {
	public Return_Object getObject() {
		return this;
	}
	
	public static void main(String args[]) {
		Return_Object obj=new Return_Object();
		
		System.out.println(obj.getObject());
	}

}
