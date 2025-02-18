package Recursion;

public class GCD {
	
	int gcd(int m,int n) {
		if(m>n)
			return gcd(n,m);
		else if(m==n)
			return m;
		else if(m==1)
			return 1;
		else if(m==0)
			return n;
		return gcd(m,n%m);		
	}

}
