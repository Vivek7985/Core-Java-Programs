package CoderPractice;

public class Instancevariable {
           
	     int v=10; //variable input given out of method and main method.
	     
	     public void instance() //create a method.
	     {
	    	 System.out.println(v);
	     }
	
	
	
	public static void main(String[] args) {
		 
		//creating a class.
            Instancevariable var=new  Instancevariable();
       
       //calling a class.  
            var.instance();
        
       //SOP statement.    
            System.out.println(var.v);
		
		
		
	}

}
