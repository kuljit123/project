package Basicprogram;
import java.util.Scanner;
public class factroial 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner (System.in);
		System.out.println("Enter a number");
		int n=sn.nextInt();
		int f=1;
		while(n!=0)
		{
			f=f*n;
			n--;
		}
		System.out.println("Factroial="+f);
		
		
	}

}

