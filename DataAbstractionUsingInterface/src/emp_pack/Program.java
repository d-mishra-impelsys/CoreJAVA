package emp_pack;

public class Program 
{
   public static void main(String []args)
   {
	   String type="Permanent";
	   int empid=1001;
	   String name="Sumit";
	   float salary=40000;
	   InterfaceEmployee emp=null; //Must be initialized	  
	   emp=EmployeeFactory.CreateEmployee(type,empid,name,salary);
	   System.out.println(emp.getDetails());
	   System.out.println(emp.getSalary());
	   System.out.println(emp.showWorkingTimeDetails());	   
   }
}
