
public class Program0 
{
	public static void main(String args[])
	{
		char arr[]=new char[]{'a','b','c'};
		System.out.println(arr);		
		//arr="abc"; // Error:  Char array is not a string	
		//String ss=arr; // Error: Type Mismatch		
		String s=new String("JAVA");
		//String ss1="JAVA";
		System.out.println(s+" "+s.length());
		
		System.out.println("**************************************");
		String s1=new String("JAVA");		
		// Q1. How many Objects Created ? 2 
		String s2=new String("JAVA");
		// Q2. How many Objects Created ? 1
		String s3="JAVA";
		// Q3. How many Objects Created ? 0
		String s4="Angular";
		// Q4. How many Objects Created ? 1
		String s5="JAVA";
		// Q5. How many Objects Created ? 0
		
		/* String is not an char array so following statements are invalid
		    char ch=str[0]; str[0]='a';
		    for(char ch:str).. foreach loop is applicable only or array or collection objects
		 */
		
		// Huge number of anonymous String Object Created Internally in most of JAVA application, 
		// so to avoid the duplication of objects which having same values and by reusing it , 
		// just to make use of memory effectively. String constant pool provides that feature.
		// String str=str1+" "+str2+" "+str3; 
	}
}
















/*
Program0:
1. Two Objects , It will serach any "JAVA" object is existing in string constant pool
area or not. IF not then create "JAVA" object in string pool and then create another object in heap with that value.

2. Already in string constant pool so it will not create again. Only just create
a new object in heap.So just one more object.

3. No more objects created , becuase "JAVA" is already in String constant pool.

4. One object create in pool area.

5. No more object created.
*/