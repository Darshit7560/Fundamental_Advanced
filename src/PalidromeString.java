import java.util.Scanner;

public class PalidromeString {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a String:");
		String str=sc.next();
		
		String org_str=str;
		
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(org_str.equals(rev))
		{
			
			System.out.println("THe give String is  a palidrome String");
			
		}
		else
		{
			System.out.println("the given String is not  apalidrome");
		}
	}

}
