package Abstarction;

public class DemoAbs1 extends Absclass
{
	
double x;
public DemoAbs1(double x)
{
this.x=x;
start(8.0,6.0);
}


@Override
void area(double x)
{

	
}
@Override
void vol(double x,double y) {
	double res=4/3*y*y;
	System.out.println("volume="+res);
}




	
}
