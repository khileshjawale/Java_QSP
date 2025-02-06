class EXMP
{
	public static void main(String[]args)
	{
		int num = 0;
		System.out.println();
		System.out.println("EVEN NUMBERS");
		
		while (num<=100)
		{
			if ((num%2==0)&&(num>=1))
			{
				System.out.print(num+" ");
			}
			num++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("ODD Numbers");
		int num1 = 0;
		while (num1<=100)
		{
			if ((num1%2!=0)&&(num>=1))
			{
				System.out.print(num1+" ");
			}
			num1++;
		}
	}
}

































/*
import java.util.Scanner;
class EvenOdd1 
{
	public static void main(String[] args) 
	{
		int num = 0;
		System.out.println();
		System.out.println(" EVEN NUMBERS ");
		while (num<=100)
		{
			if ((num%2==0)&&(num>=1))
			{
				System.out.print(num+" ");
			}
			//System.out.println(num);
			num++;
		} 
		System.out.println();
		System.out.println();
		System.out.println(" ODD NUMBERS ");
		int num1 = 0;
		while (num1<=100)
		{
			if (num1%2!=0)
			{
				System.out.print(num1+" ");
			}
			//System.out.println(num);
			num1++;
		}
		
	}
}
*/