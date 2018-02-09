package kuljit;
import java.util.Scanner;
public class oddeven {
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter any number");
		int var=sn.nextInt();
		if(var%2==0)
		{
		System.out.println("Number is even");	
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
