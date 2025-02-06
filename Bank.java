import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		{
			
			System.out.println();
			System.out.println("-------------Welcome-------------");
			System.out.println("      ---LAXMI CHIT FUNDS---    " );
			System.out.println();
			System.out.println("1.Existing User");
			System.out.println("2.Create Account");
			System.out.println();
			System.out.print("Choose the Option :");
			int option = sc.nextInt();
			
			switch (option)
			{
			case 1:
			{
				for ( ; ; )
				{
					System.out.println();
					System.out.println("---LOGIN---");
					System.out.println();
					System.out.print("Enter the UserName :");
					String userName = sc.nextLine();
					System.out.println("Enter The Password");
					String password = sc.nextLine();
					System.out.println();
					
					
					System.out.println("Logged IN Successfully");
				}
			}
			case 2 :
			{
				System.out.println();
				System.out.println("----CREATE ACCOUNT----");
				System.out.println();
				System.out.println("Enter The Name : ");
				
				System.out.println("Enter The Mail ID : ");
				System.out.println("Enter Contact Details : ");
				System.out.println("Address :");
				System.out.println("Set Password");
				
				System.out.println("ACCOUNT CREATED SUCCESSFULLY");
				
			}		
				
			
			}
			
			
		}
		
	}
}
