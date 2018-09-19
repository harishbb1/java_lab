class bank
{
int getrateofinterest()
{
return 0;
}
}
class sbi extends bank
{
int getrateofinterest()
{
return 8;
}
}
class icici extends bank
{
int getrateofinterest()
{
return 7;
}
}
class axis extends bank
{
int getrateofinterest()
{
return 9;
}
}
class test
{
public static void main(String args[])
{
sbi s=new sbi();
icici i=new icici();
axis a=new axis();
System.out.println("sbi rate of interest"+s.getrateofinterest());
System.out.println("icici rate of interest"+i.getrateofinterest());
System.out.println("axis rate of interest"+a.getrateofinterest());
}
}
