
public class Program1 
{
	public static void main(String args[])
	{
		//Object obj=new Object();
		//System.out.println(obj.hashCode());
		//System.out.println(obj.toString());
		
		String s1="abc";
		String s2=new String("abc");
		//String s33=new String("abc");
		//System.out.println(s1 == s2 ? "Objects are same":"Objects are Different");
	//	System.out.println(s1.equals(s2) ? "Objects values are same":"Objects values are Different");
		//System.out.println(s1.hashCode()==s2.hashCode() ? "Objects hash values are same":"Objects hash values are Different");
		//System.out.println("Hashcode:"+s1.hashCode()+":"+s2.hashCode());
		
	    System.out.println("*************************************************");
		String s3="abc";
		String s4="abc";
		System.out.println(s3 == s4 ? "Objects are same":"Objects are Different");
		System.out.println(s3.equals(s4) ? "Objects values are same":"Objects values are Different");
		System.out.println(s3.hashCode()==s4.hashCode() ? "Objects hash values are same":"Objects hash values are Different");
		System.out.println("Hashcode:"+s3.hashCode()+":"+s4.hashCode());
		
		System.out.println("*************************************************");
		String s5=new String("abc");
		String s6=new String("abc");
		System.out.println(s5 == s6 ? "Objects are same":"Objects are Different");
		System.out.println(s5.equals(s6) ? "Objects values are same":"Objects values are Different");
		System.out.println(s5.hashCode()==s6.hashCode() ? "Objects hash values are same":"Objects hash values are Different");
		System.out.println("Hashcode:"+s5.hashCode()+":"+s6.hashCode());
		
		
	}

}
