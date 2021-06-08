package leecode;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        boolean b = searchMatrix(ints, 5);
        System.out.println(b);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        //从矩阵右上角开始搜索
        //列
        int col = matrix[0].length - 1;
        //行
        int row = 0;

        while (col >= 0 && row < matrix.length) {
            if (target == matrix[row][col]) {
                //如果找到就直接返回
                return true;
            } else if (target < matrix[row][col]) {
                //如果查找的值大了，下一步往左找
                col--;
            } else if (target > matrix[row][col]) {
                //如果查找的值小了，下一步往下找
                row++;
            }
        }
        return false;
    }
}