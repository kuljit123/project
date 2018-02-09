package pattern;
import java.util.Scanner;
public class Ptrn6 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		int i,j,k;
		
		
		for(i=1;i==5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
				System.out.println(" ");
				
		}	
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
	
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
	}
}
		


