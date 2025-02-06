import java.util.Scanner;
class SeasonsCheck
{
	public static void main(String[] args) 
	{
		Scanner Cs = new Scanner(System.in);
		System.out.println("\n ****Season Finder by Month**** ");
		System.out.println("Enter the Month :");
		String mon = Cs.nextLine().toUpperCase();
		String op =((mon.equals("OCT")) || (mon.equals("NOV")) || (mon.equals("DEC")) || (mon.equals("JAN")))
			?("Winter"):((mon.equals("FEB")) || (mon.equals("MAR")) || (mon.equals("APR")) || (mon.equals("MAY")))
			?("SUMMER"):((mon.equals("JUN")) || (mon.equals("JUL")) || (mon.equals("AUG")) || (mon.equals("SEP")))
			?("MANSOON"):("INVALID");
		System.out.println(op);
	}
}
