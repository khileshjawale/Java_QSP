import java.util.Scanner;
class Tax2025
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("---------Tax Update 2025----------");
		System.out.println();
		System.out.println("Enter The Yearly Income :");
		int income = sc.nextInt();
		
		if (income>=0 && income<=1200000)
		{
			System.out.println("You are a Tax Free Buddy :");
		}
		else if (income>=1200000 && income<=1600000)
		{
			double op = (income*0.15);
			System.out.println("Your Payable Tax Without Saving is :"+op);
		}
		else if (income>=1600000 && income<=2000000)
		{
			double op = (income*0.2);
			System.out.println("Your Payable Tax Without Saving is :"+op);
		}
		else if (income>=2000000 && income<=2400000)
		{
			double op = (income*0.25);
			System.out.println("Your Payable Tax Without Saving is :"+op);
		}
		else if (income>2400000)
		{
			double op = (income*0.3);
			System.out.println("Your Payable Tax Without Saving is :"+op);
		}
		
	}
}
