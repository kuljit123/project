package Array;
import java.util.Scanner;
public class Arr2 
{
	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int[][] arr1  = { {5,3},{6,9}};

	System.out.println("Enter elements in array");

		for(int i = 0; i<arr.length; i++){

		for(int j=0; j<arr[i].length; j++)

		{

			arr[i][j]= sn.nextInt();

		}

	}

			System.out.println("Matrix::");

		for(int i = 0; i<arr.length; i++)
		{

		for(int j=0; j<arr[i].length; j++)

		{

			System.out.print(arr[i][j]+"\t");

		}

		System.out.println();

		}	



	}


}
