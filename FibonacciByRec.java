import java.util.*;
class FibonacciByRec{
public static int fibonacciByRecurtion(int n){
if(n<=1)
return n;
else
return (fibonacciByRecurtion(n-1)+fibonacciByRecurtion(n-2));
}
public static void main(String args[])
{
System.out.println("Enter Number of Term of febonacci");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println("{");
if(number>0)
{
	System.out.print("{");
	for(int i=0;i<number;i++)
	{
		System.out.print(fibonacciByRecurtion(i));
		if(i<number-1){
		System.out.print(",");
	}
	}
	
	System.out.print("}");	
} 
else
System.out.println("Please Enter Positive Number of Term");
}
}