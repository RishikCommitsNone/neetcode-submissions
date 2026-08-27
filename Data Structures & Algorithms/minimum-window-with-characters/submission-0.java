class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int curr_len = 0;
        int min_len = Integer.MAX_VALUE;
        int starting = -1;
        int i = 0;
        int j = 0;
        int start_index = -1;
        int[] freq = new int[128];
        int len = 0;
        for(char c: t.toCharArray()){
            freq[c]++;
        }
        while(i < m){
            if(freq[s.charAt(i)] > 0){
                len++;
            }
            freq[s.charAt(i)]--;
            while(len == n){
                if((i - j + 1) < min_len){
                    min_len = i - j + 1;
                    start_index = j;
                }
                freq[s.charAt(j)]++;
                if(freq[s.charAt(j)] > 0){
                    len--;
                }
                j++;
            }
            i++;

        }
        if(start_index == -1){
            return "";
        }
        else{
            return s.substring(start_index, start_index + min_len);
        }

    }
}
