package array;

public class ArrayIntegers
{
	public static void main(String [] args)
	{
		
		//Boxing and Unboxing
		System.out.println("******************Boxing and Unboxing******************");
		int val1=1000;
		Integer boxInt=new Integer(val1); // Boxing
		System.out.println("Box:"+boxInt.toString());
		int val2=(int)boxInt;             //UnBoxing
		System.out.println("Box:"+val2);		
		//-------------------------------------------
		System.out.println("******************Array Of int primitive types******************");
		int arr1[];
		arr1=new int[5];  // Length of array once created can't changed. Its constant
		arr1[0]=100; arr1[1]=100;arr1[2]=100;arr1[3]=100;arr1[4]=100;
		
		int array2[]={1,2,3,4,5};  // initialization
		//int array2[]=new int[] {1,2,3,4,5};
		
		
		// Two ways of iterating array.	
		for(int i=0;i<arr1.length;i++)
			arr1[i]=i*2;
		
		for(int i:arr1)  // for each loop
		{
			System.out.println(i);
		}
		
		//-------------------------------------------
		System.out.println("******************Auto Boxing******************");
		
		Integer boxIntArray1[];
		boxIntArray1=new Integer[5];
		for(int i=0;i<boxIntArray1.length;i++)
			boxIntArray1[i]=i*2;	           // Boxing internally	
		for(Integer i:boxIntArray1)
		{
			System.out.println(i);			
		}
		//-------------------------------------------
		System.out.println("******************Auto Boxing******************");
		Integer boxIntArray2[]={ 1,2,3,4,5 }; // Boxing internally before array initialization
		for(Integer i:boxIntArray2)
		{
			System.out.println(i);
		}
		
	}

}

