class HollowSquare{
	public static void main(String[] args){
		int n = 20;
		for (int i=0;i<n ;i++ ){
			for (int j=0;j<n ;j++ )
				System.out.print((i==0||j==0||i==n-1||j==n-1)?("*"+" "):(" "+" "));
			System.out.println();
		}
	}
}
	/*LOGIC
			   if (i==0||j==0||i==n-1||j==n-1)
				{
			     System.out.print("*"+" ");
				}
				else
					System.out.print(" "+" ");*/