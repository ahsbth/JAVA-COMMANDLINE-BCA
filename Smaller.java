class Smaller
{
public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
if(a<b)
{
if(a<c)
{
System.out.println("smaller="+a);
}
else
{
System.out.println("smaller="+c);
}
}
else
{
if(b<c)
{
System.out.println("smaller="+b);
}
else
{
System.out.println("smaller="+c);
}
}
}
}
