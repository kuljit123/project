package Interface;

public class InterfaceDemo implements I1,I2
{

	@Override
	public void display() 
	{
		System.out.println("Display"+x);
		int res=I1.display(10, 80);
		System.out.println("/////"+res);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show1()
	{
		System.out.println("show1"+i);
		int x=11.display(120,50);
		System.out.println("......."+x);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I1.super.show();
	}

}
