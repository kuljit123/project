package Basicprogram;
import java.util.Scanner;
public class fibonacci
{
	public static void main(String[] args)
	{
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter number of Terms for fibonacci series:");
		int numberOfTerms=sn.nextInt();
		int first=0;
		int second=1;
		int i, next;
		System.out.print(first+", "+second);
		for(i=3;i<=numberOfTerms;i++)
			{
				next = first + second;
				System.out.print(", "+next);
				first=second;
				second=next;
			}
	}
	
		
}

