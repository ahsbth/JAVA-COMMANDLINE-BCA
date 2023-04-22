import java.io.*;
class Calc
{ 
   public int add(int ...n)
   {
   int sm=0;
   for(int i:n)
     {
		 
	sm=sm+i;	 
	 }
	  return (sm);
	  
   }
}


  class Varargs
  {  
      public static void main(String args[])
	     {
		    Calc ob=new Calc();
			System.out.println(ob.add(4,6,4,5));
		}
}