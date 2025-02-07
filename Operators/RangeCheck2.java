import java.util.Scanner;
class  RangeCheck2
{
	public static void main(String[] args) 
	{
		Scanner Cs = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = Cs.nextInt();
		String op =((num%2 == 0 && num%5==0)?("HiTwoFive"):((num%2==0)?("HiTwo"):(num%5 == 0)?("HiFive"):("blank")));
		System.out.println(op);
	}
}
