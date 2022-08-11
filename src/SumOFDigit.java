
public class SumOFDigit {
	public static void main(String[] args) {
		
		int num=125;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("The sum Of Numbers Is:"+sum);
	}

}
