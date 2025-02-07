import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner lc = new Scanner(System.in);
		System.out.println();
		System.out.println("         <-- Loan Calculator --> ");
		System.out.println();
		System.out.println("Enter the Amount : ");
		float lAmount = lc.nextFloat();
		
		System.out.println("Enter Rate of Interest (ROI %) = ");
		float roi = lc.nextFloat();
		
		System.out.println("Enter The Loan Duration (In Months) :");
		int months = lc.nextInt();
		String str = ((months/12)+"."+(months%12));
		float con = Float.parseFloat(str);
		
		float intYear = (lAmount*roi/100);
		System.out.println("Interest Per Year : "+intYear);
		
		float totalInterest = intYear * con;
		System.out.println("Total Payable Interest: "+totalInterest);
		
		float outstanding = (totalInterest + lAmount);
		System.out.println(" Outstanding Amount : "+outstanding);
		
		float emi = (outstanding/months);
		System.out.println(emi);
		
	}
}
