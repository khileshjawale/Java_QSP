import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp=0 , cng=0, ss=0, mns=0, aap=0, nota=0;
		System.out.println();
		System.out.println("      Welcome For Voting     ");
		System.out.println();
		System.out.println("Enter The Popuation");
		int population = sc.nextInt();
		
		for(int i = 1 ; i <= population; i++)
		{
			System.out.println();
			System.out.println(" ### List of the Parties ###");
			System.out.println();
			System.out.println("1. BJP");
			System.out.println("2. Congress");
			System.out.println("3. Shiv Sena");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			
			System.out.println("Enter Your Vote ");
			int vote = sc.nextInt();
			
			if(vote == 1){
				bjp++;
				
			}
			if(vote == 2){
				cng++;
				
			}
			if(vote == 3){
				ss++;
				
			}
			if(vote == 4){
				aap++;
				
			}
			if(vote == 5){
				mns++;
				
			}
			if(vote == 6){
				bjp++;
				
			}
			if(!(vote>=1 && vote <=6)){
				i--;
				System.out.println("INVALID OPTION");
			}
		}
		
		if(bjp>=cng && bjp >= ss && bjp >=aap && bjp>=mns && bjp >=nota)
		{
		  System.out.println("BJP Has Won the Election" + vote + "Votes" );
		}
		
		if(cng>=bjp && cng >= ss && cng >=aap && cng>=mns && cng >=nota)
		{
		  System.out.println("CNG Has Won the Election" + vote + "Votes" );
		}
		
		if(ss>=bjp && ss >= cng && ss >=aap && ss >=mns && ss >=nota)
		{
		  System.out.println("SS Has Won the Election" + vote + "Votes" );
		}
		
		if(aap>=bjp && aap >= cng && aap >= ss && aap >=mns && aap >=nota)
		{
		  System.out.println("AAP Has Won the Election" + vote + "Votes" );
		}
		
		if(mns>=bjp && mns >= cng && mns >= ss && mns >=mns && mns >=nota)
		{
		  System.out.println("MNS Has Won the Election" + vote + "Votes" );
		}
		
		if(nota>=bjp && nota >= cng &&  nota >= ss &&  nota >= mns)
		{
		  System.out.println("NOTA Has Won the Election" + vote + "Votes" );
		}
	}
}
