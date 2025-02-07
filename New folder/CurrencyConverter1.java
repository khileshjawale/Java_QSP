import java.util.Scanner;
class CurrencyConverter1 
{
	public static void main(String[] args) 
	{
		
		Scanner cr = new Scanner(System.in);
		System.out.println("    ###- Currency Converter -###");
		System.out.println();
		System.out.println("Enter the Amount in (INR) :");
		float inr = cr.nextFloat();
		System.out.println();
		
		System.out.println("List of Currency");
		System.out.println("1. USD");
		System.out.println("2. AFN");
		System.out.println("3. BYN");
		System.out.println("4. EUR");
		System.out.println("5. IQD");
		System.out.println("6. PKR"); //0.0166543 
		System.out.println("7. MYR");
		System.out.println("8. ILS");
		System.out.println("9. NPR");
		System.out.println("10. TJS");
		
		System.out.println("Enter The Currency : ");
		String curr = cr.next().toUpperCase();
		
		float converted = 0;
		
		if (curr.equals("USD")){
			converted = inr*0.0115512f;	
			System.out.println(inr +" INR = "+converted+" USD" );
		}
		
		else if (curr.equals("AFN")){
			converted= inr*0.88105089f;	
			System.out.println(inr +" INR = "+converted+" AFN" );
		}
		
		else if (curr.equals("BYN")){
			converted= inr*0.0377729f;	
			System.out.println(inr +" INR = "+converted+" BYN" );
		}
		
		else if (curr.equals("EUR")){
			converted= inr*0.0110792f;	
			System.out.println(inr +" INR = "+converted+" EUR" );
		}
		
		else if (curr.equals("IQD")){
			converted= inr*15.1483f;	
			System.out.println(inr +" INR = "+converted+" IQD" );
		}
		
		else if (curr.equals("PKR")){
			converted= inr*3.21910f;	
			System.out.println(inr +" INR = "+converted+" PKR" );
		}
		
		else if (curr.equals("MYR")){
			converted= inr*0.0507204f;	
			System.out.println(inr +" INR = "+converted+" MYR" );
		}
		
		else if (curr.equals("ILS")){
			converted= inr*0.0416093f;	
			System.out.println(inr +" INR = "+converted+" ILS" );
		}
		
		else if (curr.equals("NPR")){
			converted= inr*1.60075f;	
			System.out.println(inr +" INR = "+converted+" NPR" );
		}
		
		else if (curr.equals("TJS")){
			converted= inr*0.125986f;	
			System.out.println(inr +" INR = "+converted+" TJS" );
		}
		
		else{
			System.out.println("Invalid Input" );
		}
	}
}
