class vowelPresent{
public static void present(String s)
{
String S1=s.toLowerCase();
for(int i=0;i<S1.length();i++)
{
char ch=S1.charAt(i);
if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.println("Vowel is present");
break;
}

}
}

public static void main(String args[])
{
String s="Sanjay";
present(s);
}
}