package pattern;
import java.util.Scanner;
public class Ptrn4 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			k=1;
			for(j=1;j<=5;j++)
			{
				if(j>=4-i&&j<=i+2)
				{
					System.out.print(+k);
					k++;
				}
				else
				{
				System.out.print(" ");
				}
				
			}
				System.out.println("\n");
			}
			
		}
}
		
		
	


