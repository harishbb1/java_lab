class MultithreadingDemo extends Thread
{
public void run()
{
try
{
System.out.println("Thread"+Thread.currentThread().getId()+"is running");
}
catch (Exception e)
{
System.out.println("exception is caught");
}
}
}
public class multithreading
{
public static void main(String[] args)
{
int n=8;
for (int i=0;i<8;i++)
{
MultithreadingDemo object=new MultithreadingDemo();
object.start();
}
}
}
