package pattern;
import java.util.Scanner;
public class Ptrn5
{
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sn.nextInt();
		int i,j,k,number;
		for(i=0;i<n;i++)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			number=i;
			for(j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}
		
	}

}
