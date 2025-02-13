class SeriesProg2
{
	public static void main(String[] args) 
	{
		System.out.println("Series program ");
		//0 1 1 2 3 5 8 13....
		
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
	    for (int i=0,n3=0 ; i<=7 ; i++)
	    {
	    	n3=n1+n2;
	    	System.out.print(n3+ " ");
	    	n1=n2;
	    	n2=n3;
	    }
	}
}
