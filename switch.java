
class Switch
{
public static void main(String args[])
{
int x=Integer.parseInt(args[0]);
int r=x%2;
switch(r)
   {
 case 0: System.out.println("even");
       break;
 case 1:System.out.println("odd");
       break;
  default:System.out.println("invalid arguments");
   }
}
}
   