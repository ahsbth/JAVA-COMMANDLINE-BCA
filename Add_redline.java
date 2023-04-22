//Add two values using readline method
import java.io.*;
import java.lang.*;
class Add_redline
{
public static void main(String args[]) throws IOException
{
InputStreamReader ISR=new InputStreamReader(System.in);
BufferReader Br=new BufferReader(ISR);
System.out.println("enter  two nos=");
int a=Integer.parseInt(Br.readLine());
int b=Integer.parseInt(Br.readLine());
int r=a+b;
System.out.println("addition="+r);
}
}



