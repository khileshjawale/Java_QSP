import java.util.Scanner;
class RangeCheck1
{
	public static void main(String[] args) 
	{
		Scanner Cs = new Scanner(System.in);
		System.out.println("Enter the character :");
		char ch = Cs.next().charAt(0);
	
		String op = ((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))?(ch+"is an Alphabet"):((ch>='0'&&ch <='9')
			  ?(ch+"is an Digit"):(ch+"is an Special Character"));
		System.out.println(op);
		
	}
}
