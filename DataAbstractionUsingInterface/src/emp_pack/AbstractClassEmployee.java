package emp_pack;

abstract class AbstractClassEmployee implements InterfaceEmployee
{
	String ename;
	int empid;
	float salary;
	AbstractClassEmployee(int empid,String ename)
	{
		this.empid=empid; this.ename=ename;
	}
	public String getDetails()
	{
		String str=this.empid+"\t"+this.ename+"\t";
		return str;
	}		
}