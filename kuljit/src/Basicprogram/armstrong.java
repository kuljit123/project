package Basicprogram;
import java.util.Scanner;
public class armstrong 
{
	public static void main(String[] args)
	{
	
		
		int k=153,temp;
		temp=k;
		int sum=0,n1;
		while(k>0)
		{
			
			n1=k%10;
			k=k/10;
			sum=sum+(n1*n1*n1);
			
		}
		if(temp==sum)
			System.out.println("Number is armstrong");
		
		else 
				System.out.println("Number is not armstrong");
		
	}
	

}
