class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        List<Integer> list  =new ArrayList<>(s);
        Collections.sort(list);
        int l = 0;
        int r = 0;
        int mSize = 1;
        while(r < list.size() - 1){
            if(list.get(r + 1) - list.get(r) != 1){
                mSize = Math.max(r - l + 1, mSize);
                r++;
                l = r;
            }
            else{
                r++;
            }
            mSize = Math.max(r - l + 1, mSize);

        }
        return mSize;
    }
}
