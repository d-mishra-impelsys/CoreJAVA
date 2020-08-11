package emp_pack;

public class Program 
{
   public static void main(String []args)
   {
	 
	   String type="Permanent";
	   int empid=1001;
	   String name="Sumit";
	   float salary=40000;
	   AbstractClassEmployee emp=null;	   //Must be initialized
	   if(type=="Contractual")
	   {
		   emp=new Contractual(empid,name,salary,2000);
	   }
	   else if(type=="Permanent")
	   {
		   emp=new Permanent(empid,name,salary,5000);
	   }
	   else
	   {
		   emp=new FullTimeEmployee(empid,name,salary);
	   }
	   System.out.println(emp.getDetails());
	   System.out.println(emp.getSalaryDetails());
	   System.out.println(emp.showWorkingTimeDetails());	   
   }
}
