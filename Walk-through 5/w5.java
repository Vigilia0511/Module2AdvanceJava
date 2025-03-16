public class w5 {
    public static void main(String[] args) {
        //1. Modify the program to find the sum of all elements in the matrix.
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix:");
        int sum = 0; 

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all elements in the matrix: " + sum);




        System.out.println(" ");
        //2. Write a program to add two matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {10, 11, 12},
            {15, 14, 13},
            {16, 17, 18}
        };
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumOfMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumOfMatrix[i][j] + " ");
            }
            System.out.println();
        }




        System.out.println(" ");
        //3. Implement matrix multiplication.
        int[][] matrix11 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix22 = {
            {10, 11, 12},
            {15, 14, 13},
            {16, 17, 18}
        };

        int rows1 = matrix11.length;
        int cols1 = matrix11[0].length;
        int rows2 = matrix22.length;
        int cols2 = matrix22[0].length;
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] productMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    productMatrix[i][j] += matrix11[i][k] * matrix22[k][j];
                }
            }
        }
        System.out.println("Product of matrices: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }




        System.out.println(" ");
        //1. Create a program that checks if a matrix is symmetric.
        int[][] matrixs = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        if (isSymmetric(matrixs)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }



        
        System.out.println(" ");
        // 2. Write a program to transpose a matrix.
        int[][] matrixs1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transpose = transposeMatrix(matrixs1);

        System.out.println("Transpose of the matrix:");
        printMatrix(transpose);
    }

    public static boolean isSymmetric(int[][] matrixs1) {
        int rows = matrixs1.length;
        int cols = matrixs1[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrixs1[i][j] != matrixs1[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] transposeMatrix(int[][] matrixs1) {
        int rows = matrixs1.length;
        int cols = matrixs1[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrixs1[i][j];
            }
        }
        return transpose;
    }

    public static void printMatrix(int[][] matrixs1) {
        for (int[] row : matrixs1) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}