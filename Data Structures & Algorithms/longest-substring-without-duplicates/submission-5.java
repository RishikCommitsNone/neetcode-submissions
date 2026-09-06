class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int ans = 0;
        Map<Character, Integer> m = new HashMap<>();
        while(r < s.length()){
            int idx = m.getOrDefault(s.charAt(r), - 1);
            if(idx != -1 && idx >= l){
                ans = Math.max(r - 1 - l + 1, ans);
                l = idx + 1;
            }
            m.put(s.charAt(r), r);
            r++;
        }
        return Math.max(ans, r - 1 - l + 1);
    }
}
