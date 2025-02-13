class SeriesProg 
{
	public static void main(String[] args) 
	{
		System.out.println(" Series Program ");
		//int num = 12;
		//144---2197---196----3375----256
		
		for (int i=1,num=12;i<=5;i++,num++ )
		{
			int pow =1;
			int p = num%2 == 0?2:3;
			for (int j=1;j<=p;j++ )
			{
				pow*=num;
			}
			System.out.println(pow+" ");
		}
			/* LOGIC
			if (i%2==0)
			{
				num = (i*i);
			}
			else
			{
				num = (i*i*i);
			}
			System.out.println(num);
			*/
		}
	}

