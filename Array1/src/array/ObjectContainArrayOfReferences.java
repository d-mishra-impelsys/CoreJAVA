package array;

import java.util.Arrays;

public class ObjectContainArrayOfReferences 
{
	public static void main(String arg[])
	{
	  PermAddress a1= new PermAddress("M.G.Road","Kavoor","Karnataka");
	  PermAddress a2= new PermAddress("Indira Road","Hubbli","Karnataka");
	  PermAddress a[]={ a1,a2 };
      Emp124 e1=new Emp124(1001,"Sanjay",a);
      System.out.println(e1);
	}    
}
class Emp124
{ 
	int empid;
	String name;
	PermAddress addresses[]=new PermAddress[2];
	
	public Emp124(int empid, String name, PermAddress[] address) {
		super();
		this.empid = empid;
		this.name = name;
		this.addresses = address;
	}
	@Override
	public String toString() {
		return "Emp124 [empid=" + empid + ", name=" + name + ", addresses=" + Arrays.toString(addresses) + "]";
	}		
}

class PermAddress
{
	String street;
	String location;
	String state;
	public PermAddress(String street, String location, String state) {
		super();
		this.street = street;
		this.location = location;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", location=" + location + ", state=" + state + "]";
	}	
	
}