package CoderPractice;

public class Methoddemo {

    /*Access modifier ReturnType MethodName()
         {SOP};*/

       public void add()
	    { System.out.println(10+20); }
    
       public void div() 
        { System.out.println(35/5); }
	
       public void mul()
       {System.out.println(35*47);}
       
       public void sub ()
       {System.out.println(97-45);}
	
	
      public static void main(String[] args) 
	{
		/*create an object)
		Class name object name=new Class name()*/
		
		Methoddemo adding=new Methoddemo();
				
			/*call a main method.
				objectname.methodname();*/
		
		adding.add();
		adding.div();
	    adding.mul();
		adding.sub();

	}

}
