import java.util.*;
class Factorial {
	public static void factorial(int n)
	{
		int factorial=1;
		for(int i=n;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("Factroial of "+n+"is"+factorial);
	}
			
  public static void main(String args[])
  {
	  System.out.println("Please Enter positive Integer For finding factorical");
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  factorial(num);
}
}
	  