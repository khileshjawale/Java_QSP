class RandomPattern{
	public static void main(String[] args) {
		for(int n=41,i=0;i<n;i++){
			for (int j = 0;j<n ;j++ )
			System.out.print((i==n/4||j==n/4||i==(n/4+n/2)||j==(n/4+n/2)||j==0&&i<(n/4)||i==0&&j<(n/4)
	                ||j==n-1&&i<n/4||i==0&&j>(n/4+n/2)||j==n-1&&i>(n/4+n/2)||i==n-1&&j>(n/4+n/2)||i==n-1&&j<n/4||j==0&&i>(n/4+n/2)
					||i==(3*n/4)+n/8&&j==n/8||i==n/8&&i==j||i==n/2&&j==n/2||i==j&&j==(3*n/4)+n/8||i==n/8&&j==(3*n/4)+n/8)?("*"+" "):(" "+" "));	
			System.out.println();
		}
	}
}