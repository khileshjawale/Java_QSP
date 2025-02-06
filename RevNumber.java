class RevNumber 
{
	public static void main(String[] args) 
	{
		int num = 234;
		int dup = num;
		int rev = 0;
		
		int rem = num%10;
		num = num/10;
		rev = rev*10+rem;
		
		rem = num%10;
		num = num/10;
		rev = rev*10+rem;
		
		rem = num%10;
		num = num/10;
		rev = rev*10+rem;
		
		System.out.println(rev);
	}
}
