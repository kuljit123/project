package Basicprogram;

import java.util.Scanner;
public class Multiply 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		Multiply m1=new Multiply();
		System.out.println("Enter value of a:: ");
		int a=sn.nextInt();
		System.out.println("Enter the vaue of b::");
		int b=sn.nextInt();
		System.out.println("Enter the vaue of K::");
		int k=sn.nextInt();
		int var=m1.Multiply(a,b,k);
		System.out.println(""+var);
		
	}


public  int Multiply (int a,int b,int k)
{
	int count=0;

	for(int i=a;i<=b;i++)
	{
		if(i%k==0)
		{
			count++;
			
		}
	}
		return count;
		}
	}
	
	
	