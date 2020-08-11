package emp_pack;

class FullTimeEmployee extends AbstractClassEmployee
{
	String eType;
	FullTimeEmployee(int empid, String ename,float salary)
	{
		super(empid,ename);
		this.salary=salary;this.eType="FullTime";
	}
	 String showWorkingTimeDetails()  // Permission given by default
	{
		return "Emp Type:"+this.eType+"\n Weekly Work Hrs:40 \nTiming: 9AM to 6PM";
	}
	public String getSalaryDetails()
	{
		return "Empno:"+this.empid+" Total Salary:"+this.salary;
	}
}

