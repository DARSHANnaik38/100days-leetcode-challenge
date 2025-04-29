class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int value = 1;

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++) {
                result[top][i] = value++;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                result[i][right] = value++;
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = value++;
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = value++;
                }
                left++;
            }
        }

        return result;
    }
}
