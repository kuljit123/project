package Abstarction;

abstract public class Absclass 
{
double x;
abstract void area(double x);
abstract void vol(double x,double y);
void start(double x,double y)
{
	area(x);
	vol( x, y);
}

}
