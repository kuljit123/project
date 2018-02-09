package Beanclasses;

 class Demo1
{
	String name;
	String idnum;

	private String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String getIdnum()
	{
		return idnum;
	}
	public void setIdnum(String newid) {
		idnum =newid;
	}

	
	public static void main(String[]args) 
	{
		Demo1 obj=new Demo1();
		Demo1 obj1=new Demo1();
		obj.setName("hjk");
		obj1.setIdnum("123");
		
	}
	}

	
	


