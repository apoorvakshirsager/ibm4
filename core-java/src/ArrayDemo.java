
	public class ArrayDemo {
		public static void main(String[] args) {
			int[] ar= {10,20,30,40,50};
			for(int i=0;i<ar.length;i++) 
				System.out.println(ar[i]);
			 for(int i:ar)
				 System.out.println(i);
			 
			 int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
			 for(int i=0;i<mat.length;i++)
			 {
				 for(int j=0;j<mat[i].length;j++)
				 {
					 System.out.print(mat[i][j]+"\t");
				 }
				 System.out.println();
			 }
	}
	
}
