class swapByXor{
public static void swap(int a,int b)
{
a=a^b;
b=a^b;
a=a^b;
System.out.println("After Swapping a="+a+"and b="+b);
}
public static void main (String args[])
{
int a=20;
int b=10;
swap(a,b);
}
}
