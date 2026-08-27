class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> elem = new HashSet<>();
        int l = 0;
        int mSum = 0;
        for(int i = 0; i < s.length(); i++){
            while(elem.contains(s.charAt(i))){
                elem.remove(s.charAt(l));
                l++;
            }
            elem.add(s.charAt(i));
            mSum = Math.max(mSum, (i - l + 1));
        }
        return mSum;
    }
}
