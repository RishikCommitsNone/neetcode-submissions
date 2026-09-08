class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];

        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        for(int i = 0; i < s2.length(); i++){
            freq[s2.charAt(i) - 'a']--;

            while(freq[s2.charAt(i) - 'a'] < 0){
                freq[s2.charAt(left) - 'a']++;
                left++;
            }

            if((i - left + 1) == s1.length()){
                return true;
            }
        }

        return false;

    }

}
