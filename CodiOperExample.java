class CodiOperExample
{
	public static void main(String[] args) 
	{
		int a = 112;
		int b = 5;
		int c = 12;
		//int d = 45;
		int temp = 0;
		
		temp = (a>b) ? ((a>c)?(a):(c)) : ((b>c)?(b):(c));

		System.out.println(temp);
	}
}
