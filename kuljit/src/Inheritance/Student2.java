package Inheritance;

public class Student2 extends student1
{
	int m1;
	int m2;
	int m3;
	Student2(int id,String name,String Std,int m1,int m2,int m3)
	{
		super(id,name,Std);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	void display1()
	{
	System.out.println("Marks m1="+m1);	
	System.out.println("Marks m2="+m2);
	System.out.println("Marks m3="+m3);
		
	}
	double calculation()
	{
		float avrg=(m1+m2+m3/3)*100;
		return avrg;
	}

}
