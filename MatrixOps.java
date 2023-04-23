/**
 * A library of basic matrix operations.
 */
public class MatrixOps {
	/**
	 * Returns the matrix resulting from adding the two given matrices,
	 * or null if the matrices don't have the same dimensions.
	 */
	public static int[][] add(int[][] m1, int[][] m2) {

		if((m1.length != m2.length) || (m1[0].length != m2[0].length)) return null;
		int [][] sum = new int [m1.length] [m1[0].length];
		for(int i=0;i<m1.length;i++) {
			for (int j=0;j<m1[0].length;j++) {
				sum[i][j] = m1[i][j] + m2[i][j];
			
		
			}
		}

		return sum;
	}

	/**
	 * Returns a unit matrix of the given size.
	 * A unit matrix of size N is a square N x N matrix that contains 0's
	 * in all its cells, except that the cells in the diagonal contain 1.
	 */

	public static int[][] unit(int n) {
		int [][] unit = new int[n][n];
		for (int i=0;i<n;i++) {
				unit [i][i] = 1;
			}
		
		return unit;
	}

	/**
	 * Returns the matrix resulting from multuplying the two matrices,
	 * or null if they have incompatible dimensions.
	 */
	public static int[][] mult(int[][] m1, int[][] m2) {
		if (m1[0].length != m2.length) return null;
		int [][] mult = new int [m1.length][m2[0].length];
		
		for(int i=0;i<m1.length;i++) {
				for (int p=0;p<m2[0].length;p++){
					int sum=0;
					for(int j=0;j<m2.length;j++) {
						sum += m1[i][j]*m2[j][p];	
			}
			mult [i][p] = sum;
		}
	}
	
		return mult;
}

	/**
	 * Returns a matrix which is the transpose of the given matrix.
	 */
	public static int[][] transpose(int[][] m) {
		//// Replace the following statement with your code
		int [][] tM = new int [m[0].length][m.length];
		for (int i=0;i<m[0].length;i++) {
			for(int j=0;j<m.length;j++) {
				tM[i][j]=m[j][i];
			}

		}
		return tM;
	}

	/**
	 * Prints the given matrix, and then prints an empty line.
	 */
	public static void println(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[1].length; col++) {
				System.out.print(m[row][col] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
		
	/** 
	 * Tests all the matrix operations featured by this class.
	 */ 
	public static void main(String args[]) {
		// Creates two matrices, for testing
		int[][] a = { { 62, 94, 36 },
			          { 75, 33, 5 }};
					  
						  
		int[][] b = { { 28, 24},
			          { 5, 48},
					  { 12, 54 } };	
		System.out.println("Matrix A:");  println(a); 
		System.out.println("Matrix B:");  println(b); 

        //// Uncomment the statements that you wish to execute.
		//System.out.println("A + B:");  println(add(a,b)); 
		System.out.println("A * B:");  println(mult(a,b)); 
		//System.out.println("I (a unit matrix of size 3):"); println(unit(3));
		////System.out.println("A * I: "); println(mult(a,unit(3)));
		
		int[][] c = { { 1, 2, 3 },
		              { 4, 5, 6 }, };
		System.out.println("Matrix C:"); println(c);
		System.out.println("C, transposed:"); println(transpose(c));
		
	}
}