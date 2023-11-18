import java.util.*;
class Fibonacci{
public static int[] findFibonacci(int []arr){
arr[0]=0;
arr[1]=1;
for(int i=2;i<arr.length;i++)
{
arr[i]=arr[i-1]+arr[i-2];
}
return arr;
}

public static void main(String args[])
{
System.out.println("Enter your number of term of Series");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
int []arr2=findFibonacci(arr);
System.out.println(arr2);
System.out.print("{");
for(int i=0;i<arr2.length;i++)
{
	System.out.print(",");
	System.out.print(arr[i]);

}
System.out.print("}");
}
}