import java.util.Scanner;
class AreaOfCircle1 
{
	public static void main(String[] args) 
	{
		Scanner Rd = new Scanner(System.in);
		System.out.print("\n Enter radius of the Circle :");
		final float Pi = 22/7f;
		float radius = Rd.nextFloat();
		final float Ar =(radius*radius)*Pi;
		System.out.println(" Area of the circle is : "+Ar);
	}
}
