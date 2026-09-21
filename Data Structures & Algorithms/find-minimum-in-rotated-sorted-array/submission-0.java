class Solution {
    public int findMin(int[] nums) {
        int curr_min = Integer.MAX_VALUE;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid] >= nums[left]){
                curr_min = Math.min(nums[left], curr_min);
                left = mid + 1;
            }
            else{
                curr_min = Math.min(nums[mid], curr_min);
                right = mid - 1;
            }
        }

        return curr_min;
    }
}
