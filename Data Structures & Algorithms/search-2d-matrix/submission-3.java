class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;
        int l = 0;
        int r = cols*row -1;

        while(l <= r){
            int mid = l + (r - l)/2;
            int R = mid /cols;
            int C = mid %cols;
            if(matrix[R][C] == target){
                return true;
            }
            else if(matrix[R][C] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        return false;
    }
}
