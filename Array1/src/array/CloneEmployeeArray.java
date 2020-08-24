package array;

public class CloneEmployeeArray
{
	public static void main(String [] args)
	{        
		Employee e1=new Employee(), e2=new Employee(), e3=new Employee();;
		Employee earr1[]={ e1,e2,e3 };
		Employee earr2[]=earr1;	
		Employee earr3[]=earr1.clone();  // it is shallow Copy primitive and reference values all copies	                                
		System.out.println(earr1[0].hashCode()+" "+earr1[1].hashCode()+" "+earr1[2].hashCode());		
		System.out.println(earr3[0].hashCode()+" "+earr3[1].hashCode()+" "+earr3[2].hashCode());
		System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());
		
		System.out.println(earr1.hashCode()+" "+earr3.hashCode());
		System.out.println(earr3[0].hashCode()+" "+earr3[1].hashCode()+" "+earr3[2].hashCode());
		earr1=null;
		earr2=null;
		// Now First Employee Array Object become availaible for GC
		earr3[0]=null;
		earr3[1]=null;
		earr3[2]=null;
		e1=null;	
		e2=null;
		e3=null;
		
		System.gc(); // or Runtime.getRuntime().gc();*/
		// Second Employee Array Object is only left in heap memory
		// but not pointing any employee objects more because all three employee objects 
		// having 1001,1002 & 1003 not exists in heap.
	}
}
class Employee
{
	int empid;
	static int idstart=1001;
	static int noe=0;
	Employee()
	{
		this.empid=idstart;
		System.out.println("NOE:"+noe);
		System.out.println("\tOne Employee Object Create with empid:"+idstart+" NOE:"+noe);
		idstart++;noe++;
	}
	int getEmpid()
	{
		return this.empid;
	}	
	void setEmpid(int newEmpid)
	{
		this.empid=newEmpid;
	}
	public void finalize()
	{
		System.out.println("\tOne Employee Object Removed");noe--;
	}

}
