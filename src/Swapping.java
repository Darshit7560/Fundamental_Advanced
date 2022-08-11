
public class Swapping {
	
	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("befor swaping values.." + a + " " + b);
		
/*
		// logic 1-thiird variale
		int t = a;
		a = b;
		b = t;
		
*/
		
/*		
		//logic 2- user aerithmatic wihout using third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		
*/
		
/*
		
		//logic-3 user* and /
		
		a=a*b;
		b=a/b;
		a=a/b;
*/
		
		
		
/*		
		//logic4 - bitwise XOR(^)
		
		a=a^b;
		b=a^b;
		a=a^b;
		
*/		
		
		//logic-5 -single statment
		b=a+b-(a=b);
		
		System.out.println("after swaping the value of a and b is :" + a + " " + b);
		
	}

}
