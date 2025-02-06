class Local1 
{
	// 1.we cannot access the variable from outside the block
	public static void main(String[] args) 
	{
		{
			int a = 10 ;
		System.out.println(a);	// 10
		}
		//System.out.println(a); // CTE
	}
}
