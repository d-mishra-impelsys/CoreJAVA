package emp_pack;

public class EmployeeFactory 
{
   static InterfaceEmployee CreateEmployee(String type,int empid,String name,float salary)
   {
	   InterfaceEmployee newEmp;
	   if(type=="Contractual")
	   {
		   newEmp=new Contractual(empid,name,salary,2000);
	   }
	   else if(type=="Permanent")
	   {
		   newEmp=new Permanent(empid,name,salary,5000);
	   }
	   else
	   {
		   newEmp=new FullTimeEmployee(empid,name,salary);
	   }
	   return newEmp;
   }
}
