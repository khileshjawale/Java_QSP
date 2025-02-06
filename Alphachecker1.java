import java.util.Scanner;
class  Alphachecker1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);   //Scanner class declared
		System.out.println("Enter The Character :");
		char alpha = sc.next().charAt(0);    // one single character Input is taken with the help of Scanner class 
		System.out.println(((alpha=='a')||(alpha== 'e')||(alpha== 'i')||(alpha== 'o')||(alpha== 'u')
			||(alpha=='A')||(alpha== 'E')||(alpha== 'I')||(alpha== 'O')||(alpha== 'U'))
			?(alpha+": Character is Vowel"):(alpha+": Character is Consonent")); //used ternary operator to check vowel or consonent
	}
}