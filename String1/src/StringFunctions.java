
public class StringFunctions 
{
	public static void main(String args[])
	{
		String str="Made In India";
		System.out.println("Length:"+str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf('d')); //2 
		System.out.println(str.indexOf('I',6));
		System.out.println(str.lastIndexOf('I'));
		System.out.println(str.substring(3));
		System.out.println("Sub:"+str.substring(3,9)); // only Two characters 5-3 , GL
		System.out.println(str.substring(str.length()-4));
		
		int posFromLast=4;
		System.out.println("From Last:"+str.substring(str.length()-posFromLast));
		System.out.println(str);	
		
	}
}
