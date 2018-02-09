package Inheritance;

public class Student3 extends Student2
{
int attendence;
String Sports;
 void Student3(int id,String name,String Std,int m1,int m2,int m3,int attendence,String Sports)
 {
	super(id,name,Std,m1,m2,m3);
	this.attendence=attendence;
	this.Sports=Sports;
 }
 double result(float avrg,int attendance,String Sports)
 {
	 
	 System.out.println("Attendance="+attendence);
	 System.out.println("Sport="+Sports);
	 System.out.println("Average ="+super.calculation());
	
	 return result;
	 }
 
float putdata(float result)
 {
	 System.out.println(" result="+result); 
	 



}
