package Interface;

public class childinterface implements Interface {
	
	public  void V1()
	{
		System.out.println("i am abstraction from parent interface v1");
	}
	
	public  void V2()
	{
		System.out.println("i am abstraction from parent interface v2");
	}

	public static void main(String[] args) {
		childinterface obj=new childinterface();
		
		obj.V1();
		obj.V2();

	}

}
 