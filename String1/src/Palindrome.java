
public class Palindrome
{
	public static void main(String args[])
	{
			String s="madam";
			String reverse="";
			System.out.println(s.length());
			for(int i=s.length()-1;i>=0;i--)
			{
				char ch=s.charAt(i); // A V A J
				reverse=reverse+ch;
				System.out.println(reverse);
			}
			System.out.println("****************************");
			if(s.equals(reverse))
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
	}
}
