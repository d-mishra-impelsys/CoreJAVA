package array;

// Program4: A Object Contain Member as a reference of another Object ( Additional Code )  . Each employee object contain reference of address objects.   
public class ObjectContainReference
{
	public static void main(String arg[])
	{
      Address a= new Address("M.G.Road","Kavoor","Karnataka");
      Emp123 e1=new Emp123(1001,"Sanjay",a);
      System.out.println(e1);
	} 
   
}
class Emp123
{ 
	int empid;
	String name;
	Address address;
	// Generated through Eclipse Tool Source->Generate Constructor
	public Emp123(int empid, String name, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	// Generated through Eclipse Tool Source->Generate toString
	@Override
	public String toString() {
		return "Emp123 [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
class Address
{
	String street;
	String location;
	String state;
	// Generated through Eclipse Tool Source->Generate Constructor
	public Address(String street, String location, String state) {
		super();
		this.street = street;
		this.location = location;
		this.state = state;
	}
	// Generated through Eclipse Tool Source->Generate toString
	@Override
	public String toString() {
		return "Address [street=" + street + ", location=" + location + ", state=" + state + "]";
	}	
	
	
}