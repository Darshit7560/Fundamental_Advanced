
public class SumOFElementInArray {
	
	public static void main(String[] args) {
		
		
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		
		
/*
		int sum=0;
		
		for(int i=0;i<=array.length-1;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("Sum Of The Give Array is:"+sum);
*/
		
		
		int sum=0;
		for(int value:array)
		{
		sum=sum+value;	
		}
		
		System.out.println("Sum Of The Give Array is:"+sum);

}
	


}
