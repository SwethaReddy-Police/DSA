class Solution {
    public int countSquares(int[][] mat) {
        int ans = 0;

        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {

                if (mat[i][j] == 1) {
                    int min = Math.min(mat[i-1][j],
                              Math.min(mat[i][j-1], mat[i-1][j-1]));

                    mat[i][j] += min;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans += mat[i][j];
            }
        }

        return ans;
    }
}