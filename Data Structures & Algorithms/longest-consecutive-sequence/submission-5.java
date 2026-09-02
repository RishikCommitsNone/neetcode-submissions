class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int l = 0;
        int r = 0;
        int ans = 1;

        Set<Integer> hs = new HashSet<>();
        
        for(int i : nums){
            hs.add(i);
        }
        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        while(r < list.size() - 1){
            if(list.get(r + 1) - list.get(r) != 1){
                r++;
                l = r;
            }
            else{
                r++;
            }
            ans = Math.max(r - l + 1, ans);
        }
        return ans;
    }
}
