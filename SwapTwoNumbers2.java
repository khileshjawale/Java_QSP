class  SwapTwoNumbers2 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 7;
		System.out.println("Numbers Before Swaping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		a=b+a;
		b=a-b;
		a=a-b;
		
		System.out.println("Numbers After Swaping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
}
