import java.util.*;
import java.io.*;
  class Ahsan
  {
	  public static void main(String args[])throws IOException
	  {
	     InputStreamReader isr=new InputStreamReader(System.in);
	     BufferedReader br=new BufferedReader(isr);
		 int a,b,c,d,e,gv;
		    
		   System.out.println("Enter five nos=");
		  a=Integer.parseInt(br.readLine());
		  b=Integer.parseInt(br.readLine());
		  c=Integer.parseInt(br.readLine());
		  d=Integer.parseInt(br.readLine());
		  e=Integer.parseInt(br.readLine());
		     if(a>b&&a>c&&a>d&&a>e)
			 {
				  gv=a;
			 }
			 else if(b>a&&b>c&&b>d&&b>e)
			 {
				 gv=b;
			 }
			 else if(c>a&&c>b&&c>d&&c>e)
			 {
				 gv=c;
			 }
			 else if(d>a&&d>b&&d>c&&d>e)
			 {
				 gv=d;
			 }
			 else 
			 {
				 gv=e;
			 }
			 System.out.println("Greattest value="+gv);
	  }
  }
	 
	    