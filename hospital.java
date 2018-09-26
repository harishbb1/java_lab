class hospital1
{
int patients()
{
return 0;
}
}
class apollo extends hospital1
{
int patients()
{
return 8;
}
}
class nimhans extends hospital1
{
int patients()
{
return 7;
}
}
class manipal extends hospital1
{
int patients()
{
return 9;
}
}
class hospital
{
public static void main(String args[])
{
apollo s=new apollo();
nimhans i=new nimhans();
manipal a=new manipal();
System.out.println("apollo"+s.patients());
System.out.println("nimhans"+i.patients());
System.out.println("manipal"+a.patients());
}
}
