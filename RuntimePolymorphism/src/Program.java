
class Employee 
{
	int empid;
	String name;
	float salary;
	int no_of_leaves;
	static int no_employees;
	// Static members or Class Initializers	
	static 
	{
		no_employees=0;  // You can call multiple methods for initialization
		System.out.println("Class Member Initialized");
	}
	// Non Static members or Object Initializers 	
	{
		this.no_of_leaves=10;    // You can call multiple methods for initialization
		System.out.println("Object Member Initialized");
	}
	
	// Different ways of Constructing Objects , Constructor Overloading
	Employee() {	}
	Employee(int empid,String name,float salary)
	{
     this.empid=empid; this.name=name;
	}
	public String toString()  // overriding toString() function of Object class
	{
		String str=this.empid+"\t"+this.name+"\t"+this.salary;
		return str;
	}	
}
class Contractual extends Employee
{
	float overtimeAmt;   // Overtime Remuneration Amount
	Contractual(int empid,String name,float salary,float amt)
	
	{ super(empid,name,salary); this.overtimeAmt=amt; }
	
	public String toString() // overriding toString() function of Employee class
	{
		String str=this.empid+"\t"+this.name+"\t"+this.salary+"\t"+this.overtimeAmt;  
		return str;
	}
}
                                                                                //Contractual Code here
public class Program 
{
	public static void main(String []args)
	{
		/*
		Contractual c=new Contractual(1002,"Supriya",50000,1000);
		System.out.println(c.toString());	 // or System.out.println(c);	
		*/
		
		/*		
		Employee emp=new Employee();			
		System.out.println(emp.toString());		
		emp=new Employee(1001,"Rahul",70000);
		System.out.println(emp.toString());		
		*/    
	   		
	}
}
