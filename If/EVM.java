import java.util.Scanner;
class EVM
{
	public static void main(String[] args) 
	{
		int bjp=0 , cng=0 , ss=0 , aap=0 , mns=0 , nota=0 ;
		
		Scanner vc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("                  *** Welcome For Election 2025 *** ");
		System.out.println();
		System.out.println(" Enter the Population : ");
		int population = vc.nextInt();
		
		for (int i = 1; i<=population ; i++ )
		{
			System.out.println();
			System.out.println("<-- The List of Parties -->");
			
			System.out.println("   1.BJP");
			System.out.println("   2.Congress");
			System.out.println("   3.Shiv Sena");
			System.out.println("   4.AAP");
			System.out.println("   5.MNS");
			System.out.println("   6.NOTA");
			System.out.println();
			System.out.println("Vote for any one : ");
			System.out.println();
			int vote = vc.nextInt();
			
			if(vote>=1 && vote<=6){
			if (vote==1)
			{
				bjp++;
					System.out.println("Apki bar 400 paar");
			}
			if (vote==2)
			{
				cng++;
					System.out.println("Aaloo Dalo Sona Niklega");
			}
			if (vote==3)
			{
				ss++;
					System.out.println("Hamari Sena Asli Sena");
			}
			if (vote==4)
			{
				aap++;
					System.out.println("Mango Man & Daru ke theke 4 bje tak chalu rahenge");
			}
			if (vote==5)
			{
				mns++;
					System.out.println("Jay Maharashtra");
			}
			if (vote==6)
			{
				nota++;
					System.out.println("You Are a Educated Person");
			}
			if(!(vote>=1 && vote <=6)){
				i--;
				System.out.println("INVALID OPTION");
			}
			}
			
		}
		
		if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
		{
			System.out.println("BJP has Won the Election");
		}
		if (cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
		{
			System.out.println("Congress has Won the Election");
		}
		if (ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
		{
			System.out.println("Shiv Sena has Won the Election");
		}
		if (aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota)
		{
			System.out.println("AAP has Won the Election");
		}
		if (mns>=bjp && mns>=cng && mns>=ss && mns>=aap && mns>=nota)
		{
			System.out.println("MNS has Won the Election");
		}
		if (nota>=bjp && nota>=cng && nota>=ss && nota>=aap && nota>=mns)
		{
			System.out.println("No one of from the list ");
		}

	}
}
