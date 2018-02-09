package Basicprogram;

	import java.util.Scanner;
public class D1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		Scanner sn=new Scanner (System.in);
	 System.out.println("Enter any number");
	 int var=sn.nextInt();
	 System.out.println("Enter any String");
	 String s=sn.next();
	 System.out.println("Enter any char");
	 Character a=sn.next().charAt(0);
	 System.out.println("Enter any value");
	 double d=sn.nextDouble();
	 System.out.println("number::"+var);
	System.out.println("String::"+s);
	System.out.println("char::"+a);
	System.out.println("double::"+d);
	}
	
	

}
