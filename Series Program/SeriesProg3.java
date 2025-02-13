class SeriesProg3 
{
	public static void main(String[] args) 
	{
		//    1       3       9        33       153       873
		//        (1+1!*2) (3+2!*3) (9+3!*4) (33+4!*5) (153+5!*6)
		int num = 1;
		int op= 0;
		for (int i=1,k=2;i<=5;i++,k++)
		{
			int fact = 1;
			for (int j=i ;j>=1;j-- )
			{
				fact *= j;
				//System.out.println(j +" : "+fact);	
			}
			//System.out.println(num+" + "+fact+" * "+k);	
			num=(num+(fact*k));
			System.out.println(num);
		}
		
	}
}
