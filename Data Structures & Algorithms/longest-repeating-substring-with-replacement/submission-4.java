class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int max_len = 0;
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < s.length()){
            freq[s.charAt(j) - 'A']++;
            max_len = Math.max(freq[s.charAt(j) - 'A'], max_len);
            if((j - i + 1) - max_len > k){
                freq[s.charAt(i) - 'A']--;
                max_len = 0;
                i++;
            }
            if((j - i + 1) - max_len <= k){
                ans = Math.max(ans, j - i + 1);
            }
            j++;
        }

        return ans;
    }
}
