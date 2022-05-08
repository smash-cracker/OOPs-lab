import java.util.Scanner;

class AddMatrix {
    public static void main(String args[]) {
    int row1, col1, row2, col2, i, j;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the row numbers of matrix 1");
    row1 = in.nextInt();
    System.out.println("Enter the column numbers of matrix 1");
    col1 = in.nextInt();
    System.out.println("Enter the row numbers of matrix 2");
    row2 = in.nextInt();
    System.out.println("Enter the column numbers of matrix 2");
    col2 = in.nextInt();

    if (row1 == row2 && col1 == col2) {
        int mat1[][] = new int[row1][col1];
        int mat2[][] = new int[row2][col2];
        int res[][] = new int[row1][col1];

        System.out.println("Enter the elements of matrix1");

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++)
                mat1[i][j] = in.nextInt();
            System.out.println();
        }

        System.out.println("Enter the elements of matrix2");
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++)
                mat2[i][j] = in.nextInt();
            System.out.println();
        }

        for (i = 0; i < row1; i++)
            for (j = 0; j < col1; j++)
                res[i][j] = mat1[i][j] + mat2[i][j];

        System.out.println("Sum of matrices: ");
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++)
                System.out.print(res[i][j] + "\t");

            System.out.println();
        }
        }
    }
}