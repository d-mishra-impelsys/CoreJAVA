
public class SqueezeExtraSpaces 
{
	public static void main(String [] args)
	{
		String text="JAVA is     a   OO programming   langugage and  it supports  static typing. ";
		
		String []words=text.split(" ");
		String result="";
		System.out.println("No of words:"+words.length);
		for(String word: words)
		{
			if(word.equals("")==false)
				result=result+" "+word;				
		}
		System.out.println("Result String:"+result);
	}

}
