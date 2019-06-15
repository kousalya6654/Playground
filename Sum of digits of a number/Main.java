import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      
        // Initialize sum value as 0
      int rev;
	    int sum = 0;
		while(n != 0)
		{ 
         rev= n%10;
            
		   sum = sum + rev;
           
		   n = n/10;
		}
		System.out.println(sum);
	}
}