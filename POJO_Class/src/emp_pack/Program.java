package emp_pack;

public class Program
{
	public static void main(String args[])
	{
		Employee emp=new Employee(1001,"Dipak",40000);
		System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getSalary());
		emp.setEmpid(1002);
		emp.setName("Sonu");
		emp.setSalary(45000);
		System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getSalary());
	}
}
