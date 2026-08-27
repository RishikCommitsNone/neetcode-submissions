class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty() == true){
            return "empty";
        }
        if(strs.size() == 1 && strs.get(0).equals(""))
            return "";
        StringBuilder sb = new StringBuilder();
        for(String i : strs){
            sb.append(i);
            sb.append(";");
        }
        sb.reverse();
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals("empty")){
            return new ArrayList<>();
        }
        if(str.equals(""))
            return new ArrayList<>(Collections.singletonList(""));
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String st = sb.toString();
        return Arrays.stream(st.split(";")).toList();
    }
}
