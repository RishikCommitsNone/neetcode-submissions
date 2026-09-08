class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int ans = -1;
        int curr= 1;
        Arrays.sort(nums);
        int i = 1;
        while(i < nums.length){
            if(nums[i] == nums[i -1]){
                i++;
                continue;
            }
            else if(nums[i] - nums[i -1] == 1){
                curr++;
            }
            else{
                ans = Math.max(curr, ans);
                curr = 1;
            }
            i++;
        }

        return Math.max(curr, ans);
    }
}
