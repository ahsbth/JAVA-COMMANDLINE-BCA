class Clang
{
public static void main(String args[])
{
int x,i,m,add;
for(i=1;i<20000;i++)
{
add=0;
m=i;
x=1;
while(x<=i/2)
{
if(i%x==0)
{
add=add+x;
}
x++;
}
if(add==m)
{
System.out.print("\t"+i);
}
}
}
}
