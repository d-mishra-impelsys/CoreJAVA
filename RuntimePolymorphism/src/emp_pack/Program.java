package emp_pack;

public class Program 
{
public static void main(String []args)
{
	Employee emp;
	
	/* Only First time during loading of class into memory static {  } initalization block 
	  will be invoked followed by Object initializer {} block execution.  */
	
	
	
	
	emp=new Employee();    
	emp=new Employee(1001,"Rohit",70000); // Next time only Object initializer {} is invoked
	emp=new Employee(1002,"Sumi",70000);  // only Object initializer {} is invoked
	
	
	/*		
	emp=new Employee();			
	System.out.println(emp.toString());		
	emp=new Employee(1001,"Rohit",70000);
	System.out.println(emp.toString());		
	*/ 
	
	/*
	Contractual c=new Contractual(1002,"Supriya",50000,1000);
	System.out.println(c.toString()); // Check after removing tostring method code from contractual class
	                                  // overTimeAmt will come in output. Invoking parent class toSTring().
	System.out.println(c);	 // Same as above statement because Implicitly calling toString() method 
	*/

}
}
