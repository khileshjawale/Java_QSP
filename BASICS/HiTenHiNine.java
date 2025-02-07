import java.util.Scanner;
class  HiTenHiNine
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit");
		int num = sc.nextInt();
		String op = ((num%10 == 0 && num%9 == 0)?(num+" HiTenHiNine"):
			((num%10 == 0)?(num+"HiTen"):((num%9 == 0)?(num+"HiNine"):("")))) ;
		System.out.println(op);
	}
}
