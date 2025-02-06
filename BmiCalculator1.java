import java.util.Scanner;
class BmiCalculator1
{
	public static void main(String[] args) 
	{
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Enter Weight in (Pounds) :");
		float weight = entry.nextFloat();
		System.out.println("Enter Height in (Meter) :");
		float height = entry.nextFloat();
		
		double kg = weight * 0.45359237;
		double inch = height * 0.0254;
		
		double Bmi = kg/(inch*inch);
		System.out.println("BMI is :"+ Bmi);
		
	}
}
