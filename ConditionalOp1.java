class ConditionalOp1 
{
	public static void main(String[] args) 
	{
		int a = 22;
		int b = 4;
		int c = 54;
		System.out.print("Largest Number is :");
		System.out.print((a>b) ? ((a>c)?(a):(c)) : (b>c)?(b):(c));
		
		System.out.print("\n Smallest Number is :");
		System.out.print((a<b) ? ((a<c)?(a):(c)) : (b<c)?(b):(c));
		}
}
