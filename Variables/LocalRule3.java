class LocalRule3
{
	// 3. we can have more than one local variable of same 
	// name within two different block of code
	public static void main(String[] args) 
	{
		{
		int a = 10;
		System.out.println(a); //10
		}
		String a = "JAVA";
		System.out.println(a); //JAVA
	}
}
