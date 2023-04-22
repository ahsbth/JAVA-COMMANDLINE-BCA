class Compound
{
public static void main(String args[])
{
float p=Float.parseFloat(args[0]);
float r=Float.parseFloat(args[1]);
float n=Float.parseFloat(args[3]);
double ci=(p*(Math.pow(1+r/100),n)-1);
System.out.println("compoundintreast="+ci);
}
}
