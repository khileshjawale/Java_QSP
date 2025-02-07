import java.util.Scanner;
class Caclulator1
{
	public static void main(String[] args) 
	{
		Scanner CC = new Scanner(System.in);
		System.out.println("\n ***Calculator*** ");
		System.out.println("\n Enter Num1 :");
		float num1 = CC.nextFloat();
	    System.out.println("Enter the Operation Character to Perform :");
		char operator = CC.next().charAt(0);
		System.out.println("Enter Num2 :");
		float num2 = CC.nextFloat();
		float op = (operator=='+')?(num1+num2):
			        (operator=='-')?(num1-num2):
			        (operator=='/')?(num1/num2):
			        (operator=='*')?(num1*num2):
			        (operator=='%')?(num1%num2):(0.000001f);
		System.out.println("\n The Answer is ");
		
		//System.out.println(num1+" "+operator+" "+num2 +" = "+op);
		
		String Output = num1+" "+operator+" "+num2 +" = "+op;
		
		if(!(op==0.000001f))
		{
			System.out.println(Output);
		}
	}
}
