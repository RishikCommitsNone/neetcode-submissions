class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_start = 0;
        int row_end = matrix.length - 1;
        while(row_start <= row_end){
            int mid_row = row_start + (row_end - row_start)/2;
            if(matrix[mid_row][0] > target){
                row_end = mid_row - 1;
            }
            else if(target > matrix[mid_row][matrix[0].length - 1]){
                row_start = mid_row + 1;
            }
            else{
                int col_start = 0;
                int col_end = matrix[0].length - 1;
                while(col_start <= col_end){
                    int col_mid = col_start + (col_end - col_start)/2;
                    if(matrix[mid_row][col_mid] == target){
                        return true;
                    }
                    else if(matrix[mid_row][col_mid] > target){
                        col_end = col_mid - 1;
                    }
                    else{
                        col_start = col_mid + 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
