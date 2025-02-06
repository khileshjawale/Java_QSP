class  SwapTwoNumbers1 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 7;
		System.out.println("Numbers Before Swaping");
		System.out.println("a :"+a);
		System.out.println("a :"+b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Numbers After Swaping");
		System.out.println("a :"+a);
		System.out.println("a :"+b);
	}
}
