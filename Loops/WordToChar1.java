import java.util.Scanner;
class WordToChar1
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String word = in.next().toUpperCase();
		int len = word.length();	
		
		char op ;
		for (int i=0 ;i<len ;i++ )
		{
			op=word.charAt(i);
			if (op =='A'||op=='E'||op=='I'||op=='O'||op=='U')
			{
				System.out.println(op+" ");
			}
		}
	}
}
