class SeriesProg4
{
	public static void main(String[] args) 
	{
		//  10        30         68        130       222
		//        (10+10*2)  (30+19*2)  (68+31*2)  (130+46*2)
		int num = 10;
		int op= 10;
		int result =0;
		System.out.println(num);
		
		for (int i=0,j=9 ; i<4 ; i++,j+=3)
		{
			result = num+op*2;
			System.out.println(result);
			num=result;
			op+=j;
		}
			
	}
}
