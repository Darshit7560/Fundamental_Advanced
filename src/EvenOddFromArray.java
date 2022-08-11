
public class EvenOddFromArray {
	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6};
		
		//for even number
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even Nummber"+a[i]);
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("Odd Nummber"+a[i]);
			}
		}
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
			
		}
		
		
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
			
		}
		

		
	}
}
