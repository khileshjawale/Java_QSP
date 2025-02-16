class FilledTriangleFlipped {
	public static void main(String[] args) {
		for (int n=10,i=0;i<n;i++){
			for (int j=0;j<n-i;j++)
				System.out.print(" "+" ");
				for (int k=0;k<i;k++)
					System.out.print("*"+" ");
		System.out.println();
		}
	}
}