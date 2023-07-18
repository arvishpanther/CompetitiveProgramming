import java.util.*;
class Xy{
void X(int x,int y)
{
	int count=0,t=0;
for(int i=x;i<=y;i++)
{for(int j=2;j<i;j++)
	{
		if(i%j==0)
			count++;	
	}
	if (count==0)
	{
		System.out.println(i);t++;
	}count=0;
}
System.out.println("total: "+t+" prime numbers between "+x+" and "+y);}
}
public class Prime
{public static void main(String []args)
{Scanner sc= new Scanner(System.in);
System.out.println("enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
if(a>=1 && b>=1)
{
Xy nc=new Xy();
nc.X(a,b);
}
else System.out.println("please kindly enter natural numbers only,have a good day>>>>heheh<<<<");
}}