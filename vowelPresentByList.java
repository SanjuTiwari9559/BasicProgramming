import java.util.*;
class vowelPresentByList{

public static void present(String s)
{
List <Character> list=new ArrayList<>();
list.add('a');
list.add('o');
list.add('u');
list.add('e');
list.add('i');
for(char ch:s.toCharArray()){
if(list.contains(ch)){
System.out.println("Vowel present");
break;
}
}
}


public static void main(String args[])
{
String s1="This is Sanjay";
present(s1);
}
}
