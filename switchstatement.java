public class switchstatement 
{
public static void main(String[] args)
{
int week=4;
String day;
switch(week)
{
case 1:
day="sunday";
break;
case 2:
day="monday";
break;
case 3:
day="tuesday";
break;
case 4:
day="wednesday";
break;
case 5:
day="thursday";
break;
case 6:
day="friday";
break;
case 7:
day="saturday";
break;
default:
day="invalid day";
break;
}
System.out.println(day);
}
}


