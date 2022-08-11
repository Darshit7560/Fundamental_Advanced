import java.util.Scanner;

public class LargestOf3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter  a First number:");
		int a=sc.nextInt();
		
		System.out.println("Enter  a Second number:");
		int b=sc.nextInt();
		
		System.out.println("Enter  a Third number:");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.print(a+"is largets number");
		}
		else if(b>a&& b>c)
		{
			System.out.println(b+"is largest nummber");
		}
		else
		{
			System.out.println(c+"is largest");
		}
	}
	
	
	

}
