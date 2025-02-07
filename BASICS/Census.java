class Census
{
	public static void main(String[] args) 
	{
		long currpop = 312032486;    //Current Population
		final long totsec =(365*24*60*60)*5;
		
		long birth = totsec/7;
		long death = totsec/13;
		long immigrant = totsec/45;
		long Np =(currpop+birth-death+immigrant);
		System.out.println(" \n ***Census of Five Years***");
		System.out.println("Total Birth every 7 seconds :"+birth);
		System.out.println("Total Death every 13 seconds :"+death);
		System.out.println("Total Immigrants Every 45 Seconds :"+immigrant);
		System.out.println(" \n Total Population After Five Years"+Np);
	}
}
