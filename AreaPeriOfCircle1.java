import java.util.Scanner;
class AreaPeriOfCircle1 
{
	public static void main(String[] args) 
	{
		System.out.println("\n **Finding Area & Perimeter of the Circle** ");
		final float Pi = 22/7f;
		Scanner Rd = new Scanner(System.in);
		System.out.print("Enter The Radius ");
		float radius = Rd.nextFloat();
		final float Ar = (radius*radius)*Pi;
		final float Pr = (2*Pi*radius);
		System.out.println("Area of the circle is : "+Ar);
		System.out.println("Perimeter of the circle is : "+Pr);
	}
}
