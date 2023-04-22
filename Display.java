import java.util.*;
import java.io.*;
   class Display
   {
	      public static void main(String args[])
		  {
			  int choice;
			  Scanner sc=new Scanner(System.in);
			  System.out.println("1.Rectangle2.circle3.Traingle4.Square");
			  System.out.println("Enter your choice from above option=");
			  choice=sc.nextInt();
			  switch(choice)
			  {
				  case 1:System.out.println("Enter length and breadth of rectangle=");
				         float l=sc.nextFloat();
						 float b=sc.nextFloat();
						 double a=l*b;
						 System.out.print("Area of Reactangle="+a);
						 break;
				  case 2:System.out.print("Enter radoius of circle=");
				        float r=sc.nextFloat();
						double ac=3.14*r*r;
						System.out.println("Area of circle="+ac);
						break;
				 case 3:System.out.println("Enter base and hight of Traingle=");
				        float bt=sc.nextFloat();
						float h=sc.nextFloat();
						double atr=0.5*bt*h;
						System.out.println("Area of Traingle="+atr);
						break;
				case 4:System.out.println("Enter side of sqaure=");
				      float s=sc.nextFloat();
					   double as=s*s;
					   System.out.println("Area of Square="+as);
					   break;
				default:System.out.println("Invalid your choice");
			  }
		  }
   }
			  