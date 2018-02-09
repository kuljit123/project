package Basicprogram;
import java.util.Scanner;
public class primeseries

{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int i;
		for(i=2;i<n;i++)
			if(n%i==0)
				break;
				if(i==n)
					System.out.println("Number is prime");
				else
					System.out.println("Number is not prime");
		
		
	}

}

