class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        String[] a = arr.clone();
        for(int i = 0; i < arr.length; i++){
            String x = arr[i];
            char[] arr1 = x.toCharArray();
            Arrays.sort(arr1);
            arr[i] = new String(arr1);

        }
        List<List<String>> ans1 = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        int val = 0;
        for(int i = 0; i < arr.length; i++){
            if(m.containsKey(arr[i])){
                ans1.get(m.get(arr[i])).add(a[i]);
            }
            else{
                ans1.add(new ArrayList<>(List.of(a[i])));
                m.put(arr[i], val);
                val++;
            }
        }
        return ans1;
    }
}
