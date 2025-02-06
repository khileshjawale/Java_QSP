import java.util.Scanner;
class CalculateTips 
{
	public static void main(String[] args) 
	{
		Scanner Tp = new Scanner(System.in);
		System.out.println("Enter Subtotal");
		float Sb = Tp.nextInt();
		System.out.println("Enter Gratuity");
		float Gr = Tp.nextInt();
		float tipRate = Sb*Gr/100;
		System.out.println(tipRate);
		float total = (Gr + tipRate);
		System.out.println(total);
	}
}
