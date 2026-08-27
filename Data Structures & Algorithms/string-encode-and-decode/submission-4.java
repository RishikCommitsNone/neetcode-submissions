class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String i : strs){
            sb.append(i.length()).append("#").append(i);
        }
        return sb.toString();
    }

    public List<String> decode(String ans) {
        int l = 0, r = 0;
        List<String> decode = new ArrayList<>();
        while(r < ans.length()){
            l = r;
            while (ans.charAt(r) != '#'){
                r++;
            }
            int length = Integer.parseInt(ans.substring(l, r));
            decode.add(ans.substring(r + 1, r + length + 1));
            r = r + length + 1;
        }
        return decode;
    }
}
