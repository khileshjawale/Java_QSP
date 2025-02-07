import java.util.Scanner;
class CelciToFahrenheit1
{
	public static void main(String[] args) 
	{
		System.out.println("\n ***Celcius to Farenheit Converter*** ");
		Scanner temp = new Scanner(System.in);
		System.out.print("Enter The Temperature in Celcius : ");
		double celcius = temp.nextDouble();
		double Farenheit = (9.0/5)*celcius+32;
		System.out.println("Temperature is converted to Fahrenheit :"+Farenheit);
	}
}
