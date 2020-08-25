
public class Toggle
{
	public static void main(String args[])
	{
		String str="impeLsYs InDIa 2020";
		String toggle="";
		//for(char ch:str) cannot iterate because str in not an array
		//{
			
		//}
		for(int i=0;i<str.length();i++)
		{
			//char ch=str[i]; cannot assign because str is not an char array
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				ch=Character.toUpperCase(ch);				
			else if(Character.isUpperCase(ch))
				ch=Character.toLowerCase(ch);
			toggle=toggle+ch;		
			
		}
		System.out.println("Toggled:"+toggle);
		
		
	}
}
