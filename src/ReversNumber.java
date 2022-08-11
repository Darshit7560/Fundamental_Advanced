import java.util.Scanner;

public class ReversNumber {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a Number: ");
		int num=sc.nextInt();
		
		/*
		//1. Using algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("the reverse nummver is :"+rev);
		*/
		
		
	/*	
		//2. Using  Stringbuffer class
		
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer reverse=sb.reverse();
		System.out.println("the reverse nummver is :"+reverse);
	*/
		
		
		//Using String Builder
		StringBuilder sl=new StringBuilder();
		sl.append(num);
		StringBuilder rev=sl.reverse();
		System.out.println("reverse number is :"+rev);
	}
	
	
	

}
