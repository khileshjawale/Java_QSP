import java.util.Scanner;
class  PassFail
{
	public static void main(String[] args) 
	{
		Scanner Cs = new Scanner(System.in);
		System.out.println("Enter the Marks (OutOf 600) :");
		int marks = Cs.nextInt();
		final int Res = marks/6;
		String op = 
			((Res>=75)?("Grade : A"):((Res<=60)&&(Res>50))
			?("Grade : B"):((Res>=35))
			?("Grade : C"):("Fail") );
		System.out.println(op);
	}
}