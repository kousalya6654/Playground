import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[500];
      int i;
      int max=0;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      for(i=0;i<n;i++)
      {
      
         
        if(a[i] >max)
        {
          max = a[i];
          
        }
      }
        System.out.println(max);
     
          
      
    }
}