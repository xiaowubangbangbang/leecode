package leecode;

public class Rotate {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Rotate().rotate(ints);
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n - i - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; ++i) {
            System.arraycopy(newMatrix[i], 0, matrix[i], 0, n);
        }

    }
}