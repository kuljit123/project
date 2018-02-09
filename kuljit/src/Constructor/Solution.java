package Constructor;

import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args)
{
	Scanner sn=new Scanner(System.in);
	Solution s1=new Solution();
	System.out.println("Enter value of a:: ");
	int a=sn.nextInt();
	System.out.println("Enter the vaue of b::");
	int b=sn.nextInt();
	System.out.println("Enter the vaue of K::");
	int k=sn.nextInt();
	int var=s1.Solution(a,b,k);
	System.out.println(""+var);
	
}
	public  int Solution (int a,int b,int k)
	{
		int count=0;

		for(int i=a;i<b;i++)
		{
			if(i%k==0)
			{
				count++;
			}
		}
		return count;
	}

}
