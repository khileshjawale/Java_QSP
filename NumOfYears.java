import java.util.Scanner;
class NumOfYears 
{
	public static void main(String[] args) 
	{
		Scanner yr = new Scanner(System.in);
		System.out.println("Enter The Minutes");
		long min = yr.nextLong();
		long mins = (365*24*60);
		long noy = min/mins ;
		long nod = (min%mins)/(60*24);
		System.out.print(noy+" Years ");
		System.out.print(" and "+nod+" Days ");
		//System.out.println(rd);

	}
}
