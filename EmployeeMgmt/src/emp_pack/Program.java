package emp_pack;

import java.util.Scanner;

public class Program
{
	// Manage Maximum 100 Employee Records
	static Employee empArray[];
	static Scanner scan=new Scanner(System.in);
	static int noe=0;
	
	public static void main(String args[])
	{ 
		empArray=new Employee[100];
		while(true)
		{
			System.out.println("1. Add Employee");
			System.out.println("2. Show Employee by Empid");
			System.out.println("3. Update Employee by Empid");
			System.out.println("4. Show All");
			System.out.println("0. Exit");
			System.out.println("\t Enter your choice:");
			int ch=Integer.parseInt(scan.nextLine());
			switch(ch)
			{
			case 1: addEmployee(); break;
			case 2: showEmpDetailsByEmpno();break;
			case 3: updateSalByEmpno(); break;
			case 4: showAll(); break;
			case 0: System.out.println("Thank you");
				System.exit(0);break;
			}
		}		
	}
	 public  static void addEmployee()
	{
		System.out.println("Enter empid:");
		int empid=Integer.parseInt(scan.nextLine());
		System.out.println("Enter name:");
		String name=scan.nextLine();
		System.out.println("Enter salary:");
		float salary=Float.parseFloat(scan.nextLine());
		empArray[noe]=new Employee(empid,name,salary);
		noe++;		
		System.out.println("\t Added succ..");
	}
	public static void showAll()
	{   System.out.println("***************************************");
		for(int i=0;i<noe;i++)
		{
			Employee temp=empArray[i];
			System.out.println(temp.getEmpid()+" "+temp.getName()+" "+temp.getSalary());
		}
		System.out.println("***************************************");
	}
	public static void updateSalByEmpno()
	{

		System.out.println("Enter empid:");
		int empid=Integer.parseInt(scan.nextLine());
		System.out.println("Enter salary:");
		float newsalary=Float.parseFloat(scan.nextLine());
		boolean employeeFound=false;
		for(int i=0;i<noe;i++)
		{
			Employee temp=empArray[i];
			if(empid==temp.getEmpid())
			{				
				temp.setSalary(newsalary);
				employeeFound=true;
				System.out.println("\t Updated successfully.");
				break;
			}
		}
		if(employeeFound==false)
			System.out.println("\t Empoyee Not Found. Not Updated.");
	}
	public static void showEmpDetailsByEmpno()
	{

		System.out.println("Enter empid:");
		int empid=Integer.parseInt(scan.nextLine());
		boolean employeeFound=false;
		for(int i=0;i<noe;i++)
		{
			Employee temp=empArray[i];
			if(temp.getEmpid()==empid)
			{
				System.out.println(temp.getEmpid()+" "+temp.getName()+" "+temp.getSalary());
				employeeFound=true; break;
			}
		}
		if(employeeFound==false)
			System.out.println("\t Not Found");
	}
}





