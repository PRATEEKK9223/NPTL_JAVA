package Recursion;

public class Fabannaci {
	
	int fabannaci(int n) {
		if(n<=0)
			return -1;
		
		else if(n==1)
			return 0;
		
		else if(n==2)
			return 1;
		else
			return fabannaci(n-1)+fabannaci(n-2);	
	}

}
