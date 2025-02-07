import java.util.Scanner;
class VowelConsonent 
{
	public static void main(String[] args) 
	{
		Scanner alpha = new Scanner(System.in);
		System.out.println("Enter the Alphabet :");
	    char ch = alpha.next().charAt(0);
		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?("Vowel"):("Consonet"));
	}
}
