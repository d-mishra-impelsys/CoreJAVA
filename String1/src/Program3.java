
public class Program3
{
	public static void main(String args[])
	{
		// Why separate String Constant Pool in heap Memory ? 
		String s1="JAVA is a",s2="object oriented",s3="language." ;
		String str=s1+" "+s2+" "+s3;  // creating anonymous string objects internally
		System.out.println(str);
		// Just find how many string objects created internally in the heap.
		
		// Why String Pool is constant ?
		// To avoid the duplication of string data which are created though a program by using + and other operators
		String str1="JAVA";
		String str2="JAVA";
		String str3="JAVA";
		// So not allowed to modify any string values because all str1,str2,str3 pointing same objects.
		// To stop this violation the char array within the string is constant.
		str1=str1+"8";
		
	}
}

