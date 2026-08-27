class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int[] freq = new int[26];
        for(int i = 0 ; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int l = 0;
        for(int i = 0 ; i < s2.length(); i++){
            freq[s2.charAt(i) - 'a']--;

            while(freq[s2.charAt(i) - 'a'] < 0){
                freq[s2.charAt(l) - 'a']++;
                l++;
            }
            if((i - l + 1) == k){
                return true;
            }
        }
        return false;
    }
}
