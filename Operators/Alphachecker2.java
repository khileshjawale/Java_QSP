import java.util.Scanner;
class Alphachecker2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Character :");
		char Ch = sc.next().charAt(0); //input is taken as a single character
		System.out.println(
		( (Ch>='a' && Ch<='z') )?( "Character is Lower Case" ):( 
			( (Ch>='A' && Ch<='Z') )?( "Character is Upper Case" ):( 
			( (Ch>='0' && Ch<='9') )?( "Character is Digit" ):( "Character is an Special Character" ) ) )	
		);
	}
}
