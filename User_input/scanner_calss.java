package User_input;
import java.util.Scanner;


public class scanner_calss {
	
	public static void main(String arf[]) {
		float sgpa;
		String name;
		
		Scanner scan=new Scanner(System.in);
		sgpa=scan.nextFloat();
		name=scan.nextLine();
		System.out.println(sgpa);
		System.out.println(name);
		scan.close();
	}
}
