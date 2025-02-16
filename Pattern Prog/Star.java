class Star {
	public static void main(String[] args) {
		for (int n =15,i=0;i<n;i++){
			for (int j=0;j<n;j++)
			System.out.print((i==j||i+j==n-1||i==n/2||j==n/2)?("*"+" "):(" "+" "));
		System.out.println();
		}
	}
}