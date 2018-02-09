package Array;
import java.util.Scanner;
public class Smallestelement 
{
	public static void main(String[] args) {

	Scanner s=new Scanner(System.in);

			System.out.println("Enter The Size of Matrix:");
			int m=s.nextInt();
			int n=s.nextInt();
			int[][] a=new int[m][n];
			System.out.println("Enter The elements");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				a[i][j]=s.nextInt();

			}

			System.out.println("The Entered Matrix is:");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
					System.out.print(a[i][j]+"\t");
					System.out.println();
			}
			int small=a[0][0];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(small>a[i][j])
						small=a[i][j];
				}
			}
			System.out.println("Smallest Element is:"+small);
			s.close();

		}
}

