package array;

public class CloneIntegers
	{

		public static void main(String [] args)
		{

			int[] a = {1,2,3};
		    int[] b = a.clone();
		    System.out.println(a == b ? "Same Instance":"Different Instance");
		    System.out.println(a[0]+","+a[1]+","+a[2]);
		    System.out.println(b[0]+","+b[1]+","+b[2]);
		    System.out.println("*********************************************");
		    a[0]=4;
		    System.out.println(a[0]+","+a[1]+","+a[2]);
		    System.out.println(b[0]+","+b[1]+","+b[2]);	  
		    // Deep copying with primitive values  
				  
		}
		
	}

