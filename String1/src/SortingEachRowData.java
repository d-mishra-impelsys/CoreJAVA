import java.util.Arrays;

public class SortingEachRowData
{
  public static void main(String[]args)
  {
	String [][] teams={ { "Sumit","Nanditt","Sameeha","Sonu"},
			{ "Ajit","Abbas","Ajay","Sahana"}, 
			{ "Zafar","Ashwin","Fathima","Roshan"}};
	int i=1;
	for(String[] team: teams)
	{
		System.out.print("Team "+i+">>  ");
		for(String member:team)
		   System.out.print(member+",");
		System.out.println();
		i++;
	}
	
	//Arrays.sort(teams);  //cannot sort multi diemnsional array
	System.out.println("*********************************");
	for(String[] team: teams)
	{
		Arrays.sort(team); 
		System.out.println(Arrays.toString(team));
	}
	
	
	
	
  }
  
}
