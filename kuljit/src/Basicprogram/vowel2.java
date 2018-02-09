package kuljit;
import java.util.Scanner;
public class vowel2 
{
	public static void main(String[] args) 
	{
	Scanner sn=new Scanner(System.in)	;
	System.out.println("Enter any character");
	char ch=sn.next().charAt(0);
	
		switch(ch)
		{
		case 'a':
		System.out.println("a is vowel");
		break;
		case 'e':
		System.out.println("e is vowel");
		break;
		case 'i':
		System.out.println("i is vowel");
		break;
		case 'o':
		System.out.println("o is vowel");
		break;
		case 'u':
		System.out.println("u is vowel");
		break;
		default :
		System.out.println("alphabet is consonant");
		}
	
	}
}
