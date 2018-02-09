package pattern;
import java.util.Scanner;

public class Ptrn2
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for( i=0;i<5;i++)
		{
			for( j=0;j<4-i;j++)
			{
				System.out.print(" ");
			}
		for( k=0;k<=i;k++)
		{
			System.out.print("*");
		}
	System.out.print("\n");
	}
	}
}
