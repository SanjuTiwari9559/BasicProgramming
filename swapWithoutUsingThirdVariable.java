class swapWithoutUsingThirdVariable{
public static void swap(int a, int b)
{
 a=a+b-a;
 b=b+a;
 System.out.println("After Swapping number a is"+a+"and b ="+b);
 }
public static void main(String args[])
{
int a=20;
int b=10;
swap(a,b);
}
}