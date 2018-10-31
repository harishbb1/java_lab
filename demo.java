import java.util.*;
class customexception extends Exception
{
customexception()
{
System.out.println("m old but still strong");
}
}
public class demo
{
public static void main(String args[])
{
Scanner b=new Scanner(System.in);
System.out.println("Enter the age");
String a=b.next();
System.out.println("Enter the name");
String d=b.next();
try
{
if(a.equals ("40") && d.equals ("rahul"))
System.out.println("you are rahul");
else
throw new customexception();
}
catch(Exception e)
{
System.out.println();
}
}
}
