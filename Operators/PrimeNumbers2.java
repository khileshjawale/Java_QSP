import java.util.Scanner;
class PrimeNumbers2 
{
	public static void main(String[] args) 
	{
		Scanner pr = new Scanner(System.in);
		System.out.println("Enter The Number to check : ");
		int num = pr.nextInt();
		String op = (num<2)?("Not a prime number "):
		            ((num/2==num/2.0 || num/3==num/3.0 || num/5==num/5.0)?("not prime"):("Prime") );
			
			
		System.out.println(op);
	}
}
