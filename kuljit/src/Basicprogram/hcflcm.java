package Basicprogram;
import java.util.Scanner;
public class hcflcm
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner sn=new Scanner(System.in);
		int x,y,hcf,lcm,t,a,b;
		x=2;
		y=3;
		a=x;
		b=y;
		while(b!=0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		hcf=a;
				lcm=(x*y)/hcf;
		System.out.println("Hcf and Lcm of = "+x+" and "+y+" is :\n");
		System.out.println("HCF="+hcf);
		System.out.println("\nLCM="+lcm);
		
		
	}

}
