package array;

import java.util.Arrays;

public class ArraysMethods 
{
	public static void main(String [] args)
	{
		int arr1[]={ 100,200,300,400};		
		
		System.out.println("****************Print String and Type********************");
		//String intArrayString = Arrays.toString(array2);
		//System.out.println( intArrayString);
		System.out.println(arr1.toString()); // invoke toString()
		System.out.println(arr1.getClass().getName()); // [ single dim, [[ two dim , I= Integer B=Byte, F=Float
		 
		System.out.println(Arrays.toString(arr1));	
		
		
		// Copying Array
		System.out.println("******************Copy upto******************");
		int arr2[]=Arrays.copyOf(arr1, arr1.length-2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		// Copying Full Array using Clone
		System.out.println("******************Cloning******************");
		int arr3[]=arr1.clone();
		arr3[2]=700;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));		
		
		// Referencing existing array
		int arr4[]=arr1;
		arr1[2]=600;
		System.out.println("******************Referencing******************");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));		
		
		// Contains in a array
		System.out.println("******************Contains******************");
		int[] intArray = { 1,2,3,4,5,6 };
		boolean b = Arrays.asList(intArray).contains(4);
		System.out.println(b);
		
	}

}
