package emp_pack;

abstract class AbstractClassEmployee 
{
	String ename;
	int empid;
	float salary;
	AbstractClassEmployee(int empid,String ename)
	{
		this.empid=empid; this.ename=ename;
	}
	String getDetails()
	{
		
		String str=this.empid+"\t"+this.ename+"\t";
		return str;
	}
	abstract String showWorkingTimeDetails();	 // undefined method
	abstract String getSalaryDetails();         // undefined method
}
