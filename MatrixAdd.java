package assignment;

public class MatrixAdd {

	public static void main(String[] args) {

		int rows = 2, columns = 4;
        int Matrix1[][] = { {7,8,1,6}, {5,7,3,1} };
        int Matrix2[][] = { {9,8,3,2}, {5,6,4,9} };

        int sum[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }
        
        System.out.println("Sum of the given matrices is: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        
        
        

        /*System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();*/
        }
	}
}


