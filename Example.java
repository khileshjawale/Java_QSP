class Example 
{
	public static void main(String[] args) 
	{
		// 1 to 10
		int i = 1;
		while (i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		// a -  z
		for (char ch= 'a';ch<='z';ch++ )
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
		// A -  Z
		for (char ch= 'A';ch<='Z';ch++ )
		{
			System.out.print(ch+" ");
		}
		
		System.out.println();
		
		// z to a
		for (char ch1= 'z';ch1>='a';ch1-- )
		{
			System.out.print(ch1+" ");
		}
		System.out.println();
		
		// Z to A
		for (char ch1= 'Z';ch1>='A';ch1-- )
		{
			System.out.print(ch1+" ");
		}
		System.out.println();
		
		// '0' to '9'
		for (char ch2 ='0';ch2<='9' ;ch2++ )
		{
			System.out.print(ch2+" ");

		}
		System.out.println();
		
		// ASCII
		
		for (int x=1 ;x<=127 ;x++ )
		{
			System.out.print(x+" : "+((char)x)+" " );
		}
	}
}
