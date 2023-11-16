class reverseByCharArray{
public static void reverse(char [] ch)
{
int start=0;
int end=ch.length-1;
while(start<end)
{
 char temp=ch[start];
 ch[start]=ch[end];
 ch[end]=temp;
 start++;
 end--;
 }
     String reversedString = new String(ch);
	 System.out.println(reversedString);
 }

public static void main(String args[])
{
String s1="SanjayTiwari";
char[] ch=s1.toCharArray();
reverse(ch);
}
}