package pattern;
import java.util.Scanner;

public class Ptrn1 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter any number::");
		int n=sn.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
		
		
			for(j=0;j<n;j++)
			{
				System.out.print("*");
				
			}
		
			System.out.println("");
		}
		
	}
}	


