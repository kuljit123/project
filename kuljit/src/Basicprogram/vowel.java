package kuljit;
import java.util.Scanner;
public class vowel 
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Enter any no.");
		char ch=sn.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case'e':
		case'i':
		case'o':
		case'u':
		System.out.println(ch+ " is vowel");
		break;
		default:
		System.out.println(ch+ " is consonant");
		}
	}
}
