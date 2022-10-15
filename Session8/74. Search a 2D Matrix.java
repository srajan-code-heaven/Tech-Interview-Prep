class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0)
            return false;
        int n = matrix[0].length;
        
        
        int pivot, left = 0, right = m*n - 1;
        while (left <= right) {
          pivot = left + (right - left) / 2;
          if (matrix[pivot/n][pivot%n] == target) 
          {
              return true;
          }
          if (target < matrix[pivot/n][pivot%n]) 
          {
              right = pivot - 1;
          }
          else
          {
              left = pivot + 1;
          }
        }
        return false;
    }
}