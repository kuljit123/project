package Polymorphism;

public class Box2 extends Box1
{
int breadth;
Box2(int length,int width,int breadth)
{
	super(length,width);
	this.breadth=breadth;
	
}
int calculate()
{
	System.out.println("area="+super.calculate());
	int volume=(breadth+length)/3;
	return volume;
	
}
}
