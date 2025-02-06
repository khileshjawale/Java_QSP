import java.util.Scanner;
class VolOfCylinder1 
{
	public static void main(String[] args) 
	{
		Scanner Rd =new Scanner(System.in);// Rd- Radius
		float Pi = 22/7f;
		System.out.print("Enter the Radius of the Cylinder :");
		float radius = Rd.nextFloat();
		System.out.print("Enter the Height of the Cylinder :");
		float height = Rd.nextFloat();
		float Ar = (radius*radius)*Pi;
		float VOC =(Ar*height);
		System.out.println("\n Area of the cylinder is : "+Ar);
		System.out.print("Volume of the cylinder is : "+VOC);
	}
}
