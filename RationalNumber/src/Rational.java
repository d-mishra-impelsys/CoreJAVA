
public class Rational
{
   private int num;
   private int den;
   Rational()
   {
	   this.num=0;this.den=1;
   }
   Rational(int val)
   {
	   this.num=val; this.den=1;
   }
   Rational(int val1,int val2)
   {
	   this.num=val1;this.den=val2;
   }
   String show()
   {
	   String s=this.num+"/"+this.den;
	   return s;
   }
   static Rational add(Rational r1, Rational r2)
   {
	  Rational r=new Rational();
	  r.num=r1.num*r2.den+r2.num*r1.den;
	  r.den=r1.den*r2.den;	   
	  return r;
   }
   Rational add(Rational r2)
   {		  
		  this.num=this.num*r2.den+r2.num*this.den;
		  this.den=this.den*r2.den;	   
		  return this;
   }
   
}
