import java .util.Scanner;
class PrimeNumbers1 
{
	public static void main(String[] args) 
	{
		Scanner prime = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = prime.nextInt();
		
		System.out.println
			((num==2||num==3||num==5)
			?(num+"Number is Prime")
			:((num%2==0||num%3==0||num%5==0)
			?("Number is not prime ")
			:(num+" Number is Prime") ) );
	}
}
