class vowelByIndexOf{
public static void present(String s)
{
for(int i=0;i<s.length();i++)
{
if(s.indexOf('a')!=-1 || s.indexOf('e')!=-1 || s.indexOf('i')!=-1 || s.indexOf('o')!=-1 || s.indexOf('u')!=-1)
{
System.out.println("Vowel Present");
break;
}
else
{
System.out.println("Vowel not Present");
}
}
}

public static void main(String args[])
{
String s1="Sanjay";
//char [] ch=s1.toCharArray();
present(s1);
}
}