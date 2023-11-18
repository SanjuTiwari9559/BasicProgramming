import java.util.*;
class FactorialByUsingRecurtion{
public static int recurtionFactorial(int n)
{
if(n<=1)
return 1;
else
return (n*recurtionFactorial(n-1));
}
public static void main(String args[]){
System.out.println("Enter Value of factorial");
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int factorialValue=recurtionFactorial(i);
System.out.println("Factorial of "+i+"is"+factorialValue);
}
}