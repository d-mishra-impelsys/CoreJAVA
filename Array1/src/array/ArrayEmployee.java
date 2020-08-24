package array;

public class ArrayEmployee
{
	public static void main(String [] args)
	{
		
		Emp earray[];
		earray=new Emp[5];
		int i=0;
		for(Emp temp:earray)
		{
			if(temp==null)
			  earray[i++]=new Emp();
		}
		for(Emp temp:earray)
		{
			System.out.println("Empid:"+temp.getEmpid());
		}
		System.out.println("*****************************************");
		//Emp e1=null,e2=null,e3=null;
		Emp e1=new Emp(),e2=new Emp(),e3=new Emp();
		Emp earray3[]={ e1,e2,e3 };
		Emp earray4[]={ new Emp(),new Emp(),new Emp() };
		
		i=0;
		for(Emp temp:earray4)
		{
			System.out.println("EMPID:"+earray4[i++].getEmpid());
		}
				
		System.out.println("*****************************************");
		Emp earray5[]=new Emp[3];i=0;
		for(i=0;i<earray5.length;i++)
			earray5[i]=new Emp();
		for(i=0;i<earray5.length;i++)
			System.out.println("EID:"+earray5[i].getEmpid());
		/*for(Emp temp:earray5)
		{
			if(temp==null) 
			{
				earray5[i]=new Emp();
				System.out.println(earray5[i].getEmpid());
				i++;
			}			
		}  */
	}
}
class Emp
{
	int empid;
	static int idstart=1001;
	static int noe=0;
	Emp()
	{
		this.empid=idstart++;noe++;
	}
	int getEmpid()
	{
		return this.empid;
	}
}
