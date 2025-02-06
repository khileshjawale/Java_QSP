class Local4 
{
	// 4. we cannot use local variables without initialization
	// Bcoz they are not assigned with default value
	public static void main(String[] args) 
	{
		boolean b;
		System.out.println(b); // variable b might not have been initialized
	}
}
