class Alphabets 
{
    public static void main(String[] args) 
	{
		char ch;
		System.out.println();
		System.out.print(" --------------AlphaBets Printer------------------- ");
		System.out.println();
		System.out.print("Lower Case :");
		
		for (ch = 'a'; ch <= 'z'; ch++) 
		{
            System.out.print(ch + " ");
        }
		
		char i = 'A';
		System.out.println();
		System.out.print("Upper Case :");
		
		while (i<='Z')
		{
			System.out.print(i+" ");
			i++;
		}
    }
}