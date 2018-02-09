package Polymorphism;

public class Box1 
{
int length;
int width;
 Box1(int length,int width)
 {
	 this.length=length;
	 this.width=width;
 }
int calculate()
{
	int area=length*width;
	return area;
}
}
