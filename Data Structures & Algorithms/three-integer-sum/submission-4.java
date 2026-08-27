class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length){
            if(i > 0 && nums[i] == nums[i - 1]){
                i++;
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0 ){
                    ans.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                    j++;
                    k--;
                    while( j < nums.length && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(k >= 0 && nums[k] == nums[k + 1]){
                        k--;
                    }
                }
                if(sum > 0){
                    k--;
                }
                if(sum < 0){
                    j++;
                }
            }
            i++;
        }
        return ans;
    }
}
