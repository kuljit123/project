package Constructor;
import java.util.Scanner;
public class Employ 
{

 Employ()
{
int emp_id;	
String emp_name,bloodgroup;
}
public Employ() 
{

float intime;
float outtime;
int leavebalance;
double salary;
}


void  salary( intime, outtime)
{
	int salary;
	System.out.println("Salary of month");
	int s1=sn.nextInt();
	System.out.println(""+s1);
	int perdaysalary=(s1/30);
	if(intime<outtime)
	{
		System.out.println("salary is=0");
		
		else
		
			System.out.println("salary is="+s1);
		}
	}
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
System.out.println("Enter emp-id");
int id=sn.nextInt();
System.out.println("Enter Employ Name");
String name=sn.next();
System.out.println("Enter Blood group");
String bloodgroup=sn.next();
System.out.println("Intime");
float intime=sn.nextFloat();
System.out.println("Out time");
float outtime=sn.nextFloat();


	
	
}
}



