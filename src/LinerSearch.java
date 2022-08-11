
public class LinerSearch {
	public static void main(String[] args) {
		
		
		int a[]= {10,20,50,40,25};
		
		int search_ele=0;
		
		
		 boolean flag=false;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==search_ele)
			{
				System.out.println("Your Element is found at index of :"+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			
		System.out.println("Not Found Your Element");

		
		}
	}
	
	
}
