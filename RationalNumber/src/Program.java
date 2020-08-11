
public class Program 
{
	public static void main(String arg[])
	{
		/*Rational r1=new Rational(4,5);
		Rational r2=new Rational(7,9);
		Rational res;
		res=Rational.add(r1, r2);
		System.out.println(r1.show());
		System.out.println(r2.show());
		System.out.println(res.show());
		*/
		Rational r1=new Rational(4,5);
		Rational r2=new Rational(7,9);
		Rational res;
		res=r1.add(r2);
		System.out.println(r1.show());
		System.out.println(r2.show());
		System.out.println(res.show());
		
		
	}

}
