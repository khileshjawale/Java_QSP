import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner yr = new Scanner(System.in);
		System.out.println("##########-Leap Year Finder-##########");
		System.out.println("Enter The Year :");
		int year = yr.nextInt();
		
		if ((year%400==0))
		{
			System.out.println(year+"Year is a Leap Year");
		}
		else
		{
			System.out.println(year+"Year is NOT a Leap Year");
		}
	}
}
