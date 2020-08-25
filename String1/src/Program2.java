
public class Program2
{

	public static void main(String args[])
	{
	System.out.println("********************String Hashcode*****************************");
	/*  Hashcode is just for individual Object Represenataion
	 * int hashcode= s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	 String s="ABC"
	 int hashcode=65*31^2 + 66*31^1 + 67 *31^0
	             =65*961  + 66*31  + 67
	             =62465  + 2046   + 67
	             =64578
	 */
	 String s="ABC";
	// System.out.println(s.hashCode());
	 
	/* String hashcode value doesn't represent that objects are same but if objects are same then definitely
	 * hashcode values must be same. 
	 */
	 String s1="FB";
	 String s2="Ea";
	 System.out.println(s1 == s2 ? "Objects are same":"Objects are Different");
         System.out.println(s1.equals(s2) ? "Objects values are same":"Objects values are Different");
	 System.out.println(s1.hashCode()==s2.hashCode() ? "Objects hash values are same":"Objects hash values are Different");
	 System.out.println(s1.hashCode()+":"+s2.hashCode());
	 
	     System.out.println("****************Object hashcode and tostring******************");
	         Object obj1=new Object();
		 Object obj2=new Object();
		 System.out.println(obj1 == obj2 ? "Objects are same":"Objects are Different");
		 System.out.println(obj1.equals(obj2) ? "Objects values are same":"Objects values are Different");
		 System.out.println(obj1.hashCode()==obj2.hashCode() ? "Objects hash values are same":"Objects hash values are Different");
		 System.out.println(obj1.hashCode()+" "+obj2.hashCode());
		 System.out.println(obj1.toString()+" "+obj2.toString()); 
		 // An object hash code value can change in multiple executions of the same application. 
		 // If two objects are equal according to equals() method, then their hash code must be same.
	}
}
