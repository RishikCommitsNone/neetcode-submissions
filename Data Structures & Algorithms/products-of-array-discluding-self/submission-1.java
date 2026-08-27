class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int[] r = new int[nums.length];
        int pro = 1;
        for(int i : nums){
            pro*= i;
            l.add(pro);
        }
        int con = 1;
        for(int i = nums.length - 1; i >=0; i--){
            con = con * nums[i];
            r[i] = con;
        }

        int[] ans = new int[nums.length];
        ans[0] = r[1];
        ans[nums.length - 1] = l.get(nums.length - 2);
        for(int i = 1; i < nums.length - 1; i++){
            ans[i] = l.get(i -1) * r[i + 1];
        }

        return ans;
    }
}  
