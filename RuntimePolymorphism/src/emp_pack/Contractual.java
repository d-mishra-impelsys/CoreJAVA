package emp_pack;

public class Contractual extends Employee
{
	float overtimeAmt;   // Overtime Remuneration Amount
	Contractual(int empid,String name,float salary,float amt)
	
	{ super(empid,name,salary); this.overtimeAmt=amt; }
	
	
}