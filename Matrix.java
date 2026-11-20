public class Matrix {
   
    public static int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        // Minimum and maximum possible answers
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            // Count elements <= mid
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < matrix[i].length; j++) {

                    if (matrix[i][j] <= mid) {
                        count++;
                    } else {
                        break;
                    }
                }
            }

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1,  5,  9},
            {10, 11, 13},
            {12, 13, 15}
        };

        int k = 8;

        System.out.println(k + "th smallest element: "
                           + kthSmallest(matrix, k));
    }
}

