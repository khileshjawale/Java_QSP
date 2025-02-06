import java.util.Scanner;
class ScMethods 
{
	public static void main(String[] args) 
	{
		Scanner Entry = new Scanner(System.in);
		System.out.print("give input for Byte : ");
		byte srno = Entry.nextByte();
		System.out.println(srno);
		
		System.out.println("give input for Short : ");
		short ID = Entry.nextShort();
		System.out.println(ID);
		
		System.out.println("give input for Int : ");
		int age = Entry.nextInt();
		System.out.println(age);
		
		System.out.println("give input for Long : ");
		long phno = Entry.nextLong();
		System.out.println(phno);
		
		System.out.println("give input for Float : ");
		float salary = Entry.nextFloat();
		System.out.println(salary);
		
	}
}
