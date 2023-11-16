class GivenNumberPrime{
public static void primeNumber(int a)
{
 for(int i=2;i<a;i++)
 {
 if(a%i==0)
 {
 System.out.println("Given Number is not a prime Number");
 break;
 }
 else {
 System.out.println("Given Number is a prime Number");
 }
 }
 }
public static void main(String args[])
{
int i=10;
primeNumber(i);
}
}