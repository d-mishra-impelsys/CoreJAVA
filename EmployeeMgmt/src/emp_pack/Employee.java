package emp_pack;

public class Employee 
{
	int empid;
	String name;
	float salary;
	Employee()
	{
		
	}	
	public  Employee(int empid, String name, float salary)
	{
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}	
}
