import java.util.Scanner;
class AreaPeriOfRectangle1 
{
	public static void main(String[] args) 
	{
		System.out.println("\n **Finding the Area & Perimeter of the Rectangle** ");
		Scanner Rd = new Scanner(System.in);
		System.out.print("Enter Value of Width :");
		float width =Rd.nextFloat();
		System.out.print("Enter Value of Height :");
		float height =Rd.nextFloat(); 
		final float Ar = width*height;
		final float Pr = (width+height)*2;
		System.out.println("\n The Area of the Rectangle is : "+Ar);
		System.out.println("The Perimeter of the Rectangle is : "+Pr);
    }
}
