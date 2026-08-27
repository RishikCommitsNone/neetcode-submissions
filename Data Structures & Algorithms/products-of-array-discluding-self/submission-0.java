class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        l[0] = nums[0];
        r[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1 ; i < nums.length; i++){
            l[i] = nums[i] * l[i - 1];
        }
        for(int i = nums.length - 2; i >=0; i--){
            r[i] = nums[i] * r[i + 1]; 
        }
        int[] ans = new int[nums.length];
        ans[0] = r[1];
        ans[nums.length - 1] = l[nums.length - 2];
        for(int i = 1; i < nums.length - 1; i++){
            ans[i] = l[i - 1]* r[i + 1];
        }
        return ans;
    }
}  
