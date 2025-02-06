import java.util.Scanner;
class RangeCheck 
{
	public static void main(String[] args) 
	{
		Scanner Cs = new Scanner(System.in);
		System.out.println("Enter the character :");
		char ch = Cs.next().charAt(0);
		System.out.println((ch >='A' && ch<='Z')?("Character is Uppuer case"):("Character is Not Uppuer case"));
		
	}
}
