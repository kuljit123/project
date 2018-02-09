package Basicprogram;
import java.util.Scanner;
public class gretest 
{
	public static void main(String[] args) 
	{
		System.out.println("hello");
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter first number=");
		int a=sn.nextInt();
		System.out.print("Enter second number=");
		int b=sn.nextInt();
		System.out.print("Enter third number=");
		int c=sn.nextInt();
		if(a>b)
		if(a>c)
		System.out.println("Greatest no.="+a);
		if(b>a)
		if(b>c)
			System.out.println("Greatest no.="+b);
		if(c>a)
		if(c>b)
			System.out.println("Greatest no.="+c);
		
		}

}
