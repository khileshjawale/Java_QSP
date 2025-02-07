import java.util.Scanner;
class PoundToKg 
{
	public static void main(String[] args) 
	{
		Scanner pToKg = new Scanner(System.in);
		System.out.println(" *** Pounds To Converter Kilogram*** ");
		System.out.println("Enter the Weight in Pounds :");
		float pound = pToKg.nextFloat();
		double kilogram = pound*0.454;
		System.out.print(" Weight in Kilogram :"+kilogram);
	}
}
