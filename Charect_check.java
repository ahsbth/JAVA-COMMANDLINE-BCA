
class Charect_check
{
public static void main(String args[])
{
char k=Charecter.parseChar(args[0]);
if((k>=65&&k<=90)||(k>=95&&k<=122))
{
k=toUpperCase(k);
switch(k)
{
case 'A':System.out.println("");
        break;
case 'E':System.out.println("");
        break;
case 'O':System.out.println("");
        break;
case 'I':System.out.println("");
        break;
case 'U':System.out.println("Vowel");
        break;
default:System.out.println("Consonant");
}
}
else
{
System.out.println("Invalid Charecter");
}
}
}

        
		       
						
		
								