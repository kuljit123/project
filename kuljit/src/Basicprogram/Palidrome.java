package kuljit;
import java.util.Scanner;
public class Palidrome
{
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		int n=1331,temp,n1;
		temp=n;
		int sum=0;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=n1+(sum*10);
			
			
		}
		if(temp==sum)
		{
			System.out.println("Number is palidrome");
		}
		else
		{
			System.out.println("Number is not palidrome");
		}
		
	}


}
