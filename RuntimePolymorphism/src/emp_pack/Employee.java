package emp_pack;
class Employee 
{
	int empid;
	String name;
	float salary;
	int no_of_leaves;
	static int no_employees;
	// Static members or Class Initializers	or static initialization block
	static 
	{
		no_employees=0;  // You can call multiple methods for initialization
		System.out.println("Class Member Initialized");
	}
	// Non Static members or Object Initialization block 	
	{
		this.no_of_leaves=10;    // You can call multiple methods for initialization
		System.out.println("Object Member Initialized");
	}
	
	// Different ways of Constructing Objects , Constructor Overloading
	Employee() {	}
	Employee(int empid,String name,float salary)
	{
     this.empid=empid; this.name=name;this.salary=salary;
	}
	public String toString()  // overriding toString() function of Object class
	{
		String str=this.empid+"\t"+this.name+"\t"+this.salary;
		return str;
	}	
}

              
