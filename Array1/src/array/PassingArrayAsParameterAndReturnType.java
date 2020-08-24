package array;

import java.util.Arrays;

public class PassingArrayAsParameterAndReturnType
{
	public static void main(String []args)
	{
		double radius[]={ 2.5,3.5,4.0,5.5,6.0};
		double areas[]=calArea(radius);
		System.out.println(Arrays.toString(radius));
		System.out.println(Arrays.toString(areas));
		
	}
	static double [] calArea(double [] rad)
	{
		double area[]=new double[rad.length];
		final double pi=3.14;
		for(int i=0;i<area.length;i++)
		{
			area[i]=pi*rad[i]*rad[i];
		}		
		return area;
	}

}
