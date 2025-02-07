class Even100TO1
{
	public static void main(String[]args)
	{
		int num = 0;
		System.out.println();
		System.out.println("EVEN NUMBERS");
		
		while (num<=100)
		{
			if ((num%2==0)&&(num>=1))
			{
				System.out.print(num+" ");
			}
			num++;
		}
	}
}