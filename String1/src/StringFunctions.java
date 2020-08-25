
public class StringFunctions 
{
	public static void main(String args[])
	{
		String str="Made In India";
		System.out.println("Length:"+str.length());//13
		System.out.println(str.charAt(3)); // e
		System.out.println(str.indexOf('d')); //2 
		System.out.println(str.indexOf('I',6));//8
		System.out.println(str.lastIndexOf('I'));//8
		System.out.println(str.substring(3)); //e In India
		System.out.println("Sub:"+str.substring(3,9)); // only Two characters 5-3 , Sub:e In I
		System.out.println(str.substring(str.length()-4)); // ndia
		
		int posFromLast=4;
		System.out.println("From Last:"+str.substring(str.length()-posFromLast));//From Last:ndia
		System.out.println(str);	
	}
}
