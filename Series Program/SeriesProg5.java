class SeriesProg5 
{
    public static void main(String[] args) 
	{
		// 79 108 139 176 217 260
		
        int num = 79;
        int num1 = 29;
        int j, count = 0;
		System.out.print(num+" ");
        while (count < 6) 
		{
            j = 2;
            boolean isPrime = true;
            while (j <= Math.sqrt(num1)) 
			{
                if (num1 % j == 0) 
				{
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime && num1 >= 29) 
			{
                num += num1;
                System.out.print(num + " ");
                count++;
            }
            num1 += 2;
        }
    }
}

