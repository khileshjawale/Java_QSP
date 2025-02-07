import java.util.Scanner;
class WordToChar 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String word = in.next().toUpperCase();
		int len = word.length();
		 
		for (int i=0 ;i<len ;i++ )
		{
			char op =word.charAt(i);
			System.out.println(op+" ");
			Thread.sleep(100);
		}
	}
}
