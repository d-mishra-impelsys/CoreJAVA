package emp_pack;

class Contractual extends FullTimeEmployee
{   
	  float commi=0;
	  Contractual(int empid, String ename,float salary,float commi)
		{
			super(empid,ename,salary);
			this.salary+=commi; this.commi=commi;this.eType="Contractual";
		}
	  String showWorkingTimeDetails()  // Overridden and not allowed to reduce visibility
		{
		return "Emp Type:"+this.eType+"\n Weekly Work Hrs:40 \n Timing: 9AM to 6PM \n Monthly Commission:"+this.commi;
		} 	  
}
