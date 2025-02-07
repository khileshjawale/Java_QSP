import java.util.Scanner;
class SumOfOddNum 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number : ");
		int num = new Scanner(System.in).nextInt(); //INPUT
		int sum = 0 ; // sum initialization
		int dup = num; // duplicate variable declaration
		
		
		while (num>0)
		{
			int rem = num%10; 
			if(rem%2 != 0)
			{
				sum += rem;
			}
			num/=10;
		}
		
		System.out.println("Sum of Odd Number is : "+sum);
		System.out.println("The Number is :	"+dup);
		
	}
}