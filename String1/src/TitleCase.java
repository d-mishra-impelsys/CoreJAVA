
public class TitleCase 
{

	public static void main(String [] args)
	{
		String text="jAVA   is a    OO      prOGramming lanGuage and It supports static typing.";
		
		String []words=text.split(" ");
		String result="";
		System.out.println("No of words:"+words.length);
		for(String word: words)
		{		
			if(word.equals("")==false)
			{
				if(word.length()>=1)
					result=result+" "+word.substring(0,1).toUpperCase();
				if(word.length()>=2)
					result=result+word.substring(1).toLowerCase();
			}							
		}
		System.out.println("Result String:"+result);
	}
}
