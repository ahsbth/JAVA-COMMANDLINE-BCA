import java.util.*;
import java.io.*;
class Even
{
	public static void main(String args[]) throws IOException
	{
		int n,r;
		InputStreamReader dis=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(dis);
		System.out.println("Enter a no=");
		n=Integer.parseInt(br.readLine());
		r=n%2;
		switch(r)
		{
			case 0:System.out.println("even");
			        break;
			case 1:System.out.println("odd");
			       break;
		   default:System.out.println("Invalid no");
		}
	}
}
	