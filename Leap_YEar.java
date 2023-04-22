class Leap_YEar
{
public static void main(String args[])
{
int y=Integer.parseInt(args[0]);
if(y%4==0)
{
if(y%100==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not leap year");
}
}
else
{
if(y%400==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not leap year");
}
}
}
}
