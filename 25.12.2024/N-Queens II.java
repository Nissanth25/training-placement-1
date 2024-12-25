class Solution {
     int count = 0;

    public int totalNQueens(int n) {
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];
        find(0, leftRow, upperDiagonal, lowerDiagonal, n);
        return count;
    }

    public void find(int col, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal, int n) {
        if (col == n) {
            count++;
            return;
        }

        for (int row = 0; row < n; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;
                find(col + 1, leftRow, upperDiagonal, lowerDiagonal, n);
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }
}
