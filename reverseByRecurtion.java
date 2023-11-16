class reverseByRecurtion{
public static String reverse(String s1)
{
if(s1.isEmpty())
{
return s1;
}
else
{
return reverse(s1.substring(1))+s1.charAt(0);
}
}


public static void main(String args[])
{
String s1="Sanjay Tiwari";
String s2=reverse(s1);
System.out.println(s2);
}
}

