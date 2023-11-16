class swap{
public static void swapNumber(int a,int b)
{
int temp=a;
a=b;
b=temp;
System.out.println("after Swapping a ="+a +"and b ="+b);
}

public static void main(String args[])
{
int a=10;
int b=20;
swapNumber(a,b);
System.out.println("Before Swapping a="+a+"and b="+b);
}
}