
public class StringIntern 
{
	public static void main(String args[])
	{
		// Use of Intern Method:
               // 1. If you want create a string object using new keyword referencing to String Pool
               // 2. If you want create a string in pool memory using new keyword
		
	
		String s1=new String("ABC");
		String s2="ABC";
		//System.out.println(s1==s2); // True or False f
		String s3=s1;
		//System.out.println(s1==s3); // True or False  t
		s1=s1.intern();   // Use 1
		// Check within the String Constant Pool having "ABC" or not. 
		// If there then Refer same object existing in pool.
		System.out.println(s1==s2); // True or False  t
		
		String s4=new String("XYZ").intern();  // Use 2
		// Check whether the "XYZ" is intern or not. It will refer that otherwise it will create in pool only. Not in heap.
		String s5=new String("XYZ");
		System.out.println(s4==s5); // True or False 
		String s6="XYZ";
		System.out.println(s5==s6); // True or False 
		System.out.println(s4==s6); // True or False 
		
        
        
	}
}
