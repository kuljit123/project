package Stringhandling;
import java.util.Scanner;
public class Strn1 
{
	public static void main(String[] args)
	{
		String s1="I have a car.";
		String s2= "Its color is black.";	
		 String s3=s1+s2;
		 
		 //Reverse
		 StringBuffer sb=new StringBuffer("This is a computer");
		 System.out.println("reverse of string");
		 System.out.println(sb.reverse());
		 System.out.println(""+s3);
		 
		 //index
		 System.out.println("Index of s1::"+s1.indexOf('a'));
		 System.out.println("Index of s2::"+s2.indexOf(('b')));
		 
		 //concatenation
		 System.out.println("Concatenation::"+s3);
		 
		 //Substring
		 String s4=s3.substring(3);
		 System.out.println("Substring::"+s4);
		 
		 //split
		 String[]srr=s1.split("");
		 System.out.println(" ");
		 for(int i=0;i<=srr.length-1;i++)
		 {
			 System.out.print(""+srr[i]);
			 System.out.println("Index:"+i+"value::"+srr[i]+"");
			 System.out.println("tocharArrayUsage");
			 char[]c=s2.toCharArray();
			 for( i=0;i<=srr.length-1;i++)
			 {
				 System.out.println("Index:"+i+"value::"+c[i]+"");
			 }
		 
		 
		 }
		
	}

}
