import java.io.*;
class Swit_cmdl
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a no");
int x=Integer.parseInt(br.readLine());
int r=x%2;
switch(r)
   {
 case 0: System.out.println("even");
       break;
 case 1:System.out.println("odd");
       break;
 default: System.out.println("invalid arguments");
   }
}
}
   