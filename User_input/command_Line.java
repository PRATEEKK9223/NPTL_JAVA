package User_input;

public class command_Line {
	
	public static void main(String args[]) {
		if(args.length<=0)
			System.out.println("command line arrguments are not given");
		else {
			for(int i=0;i<args.length;i++) {
				int j=Integer.parseInt(args[i]);
				System.out.println(args[j]);
			}
		}
	}

}
