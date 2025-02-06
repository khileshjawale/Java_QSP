import java.util.Scanner;
class SumOfNum 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter The Number : ");
		int num = new Scanner(System.in).nextInt();
		int sum = 0 ;
		int dup = num;
		
		while (num>0)
		{
			int rem = num%10;
			sum += rem;
			num /= 10;
		}
		System.out.println(sum);
		System.out.println(dup	);
		
	}
}
