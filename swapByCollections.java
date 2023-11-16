import java.util.*;
class swapByCollections{
public static void swap(int a,int b)
{
List<Integer> list=new ArrayList<>();
list.add(a);
list.add(b);
System.out.println("Before Swap a="+a+"b="+b);
Collections.swap(list,0,1);
a=list.get(0);
b=list.get(1);
System.out.println("after Swap a="+a+"b="+b);
/*for( int item:list)
{
System.out.println("after Swap b="+a+"b="+b);
} */
}
public static void main(String args[])
{
int a=10;
int b=20;
swap(10,20);
}
}
