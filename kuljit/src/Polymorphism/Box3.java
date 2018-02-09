package Polymorphism;

public class Box3 extends Box2
{
	int cost,res;
	 Box3(int length,int width,int breadth,int cost)
	{
		super(length,width,breadth);
		this.cost=cost;
		
	}
    float calculate(int volume)
	{
    	System.out.println("volume="+super.calculate());
		 res=cost*super.calculate();
		 return res;
	
	}
	void display()
	{
		//System.out.println("area="+super.calculate());
		System.out.println("volume="+super.calculate());
		System.out.println("cost="+res);
	}
}
