class primeCheckerByRecurtion{
public static void primeChecker(int a)
{
boolean b=recurtion(a,2);
public static boolean recurtion(int a,int i)
{
if(a<=1)
{
return false;
}
else{
if(i>a)
{
return true;
}
else{
if(a%i==0)
{
return false;
}
}
}
return recurtion(a,i+1);
}
if(b)
{
System.out.println("Given Number is prime");
}
System.out.println("Given Number is not prime");
}

public static void main(String args[]){
int s=15
primeChecker(s);
}
}