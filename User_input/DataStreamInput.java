package User_input;
import java.io.*;//import java.io.DataInputStream;
//the DataInputStream class takes the input as a binary form not in String form
public class DataStreamInput {
	public static void main(String args[]) {
		try {
			DataInputStream obj=new DataInputStream(System.in);
			System.out.println("eNter the str you want");
			String name=obj.readLine();//it is dispreted from the DataInputStream class
			System.out.println(name);
			int age=obj.readInt();
			System.out.println(age);
			
				
		}catch(Exception e) {
			
			System.out.println(e);
		}	
	}	
}
