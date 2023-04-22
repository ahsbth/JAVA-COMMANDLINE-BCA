import java.io.*;
import java.util.*;
import java.lang.*;
class Calc
{
int a,b,r;
 public Calc()
{
a=8;
b=7;
r=a+b;
System.out.println("Result="+r);
}
public Calc(int n)
{
	System.out.println("Result="+n);
}
}
class Demo
{
public static void main(String args[])
{
Calc c=new Calc(3);

}
}

