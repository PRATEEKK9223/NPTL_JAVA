package Recursion;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);

		//this for to find factorial of a number
		Factorial fact=new Factorial();
		System.out.println("enter a number to find factorial");
		int num=scan.nextInt();
		int result1=fact.factorial(num);
		System.out.println("factorial of "+num+":"+ result1);
		
		//This for finding the fabanacci nth  term and series
		
		Fabannaci fab=new Fabannaci();
		System.out.println("enter a number of temrs to find fabannaci sequence and also the nth term");
		
		int num2=scan.nextInt();
		int result2=fab.fabannaci(num2);
		System.out.println("the nth term of fabannaci sequence is "+ result2);
		System.out.println("the Fabanacci sequence is ");
		
		for(int i=1;i<=num;i++)
			System.out.println(fab.fabannaci(i));

		
		//this is for find the Greatest of comman division(GCD)
		
		GCD G=new GCD();
		
		System.out.println("enter two number to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		scan.close();
		int result3=G.gcd(m, n);
		System.out.println("GCD of "+m+" and "+n+"= "+result3);
		
		
		
		
		
	}

}
