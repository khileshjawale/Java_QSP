class ReversedFlippedFilledTriangle {
	public static void main(String[] args) {
		int n=10;
		for (int i=0;i<n;i++){
			for (int j=0;j<i;j++)
				System.out.print(" "+" ");
				for (int k=0;k<n-i;k++)
					System.out.print("*"+" ");
				System.out.println();
		}
	}
}

/* LOGIC
int n = 10;
for (int i=0;i<n ;i++ ){
	for (int j=0;j<n ;j++ ){
		if (j<i){
			System.out.print(" "+" ");
		}else
			System.out.print("*"+" ");
	}
	System.out.println();
} */