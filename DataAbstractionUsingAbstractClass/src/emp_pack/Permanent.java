package emp_pack;

class Permanent extends FullTimeEmployee
{    
	float bonus=0;
	Permanent(int empid, String ename,float salary,float bonus)
	{
		super(empid,ename,salary);
		this.salary+=bonus; this.bonus=bonus; this.eType="Permanent";
	}
	String showWorkingTimeDetails()     // Overridden and not allowed to reduce visibility
	{
	return "Emp Type:"+this.eType+"\n Weekly Work Hrs:40 \n Timing: 9AM to 6PM \n Monthly Bonus:"+this.bonus;
	}
}