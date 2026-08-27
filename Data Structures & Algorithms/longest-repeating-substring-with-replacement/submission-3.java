class Solution {
    public int characterReplacement(String s, int k) {
        int max_count = Integer.MIN_VALUE;
        int[] freq = new int[26];
        int l = 0;
        int res = 0;
        for(int r = 0; r < s.length(); r++){
            freq[s.charAt(r) - 'A']++;
            max_count = Math.max(freq[s.charAt(r) - 'A'], max_count);

            while((r - l + 1) - max_count > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            if((r - l + 1) > res){
                res = r - l + 1;
            }
        }

        return res;
    }
}
