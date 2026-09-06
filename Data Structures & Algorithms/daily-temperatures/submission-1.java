class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[temperatures.length];
        int i = 0;
        while(i < temperatures.length){
            while(!s.empty() && temperatures[s.peek()] < temperatures[i]){
                int idx = s.pop();
                ans[idx] = i - idx;
            }
            s.push(i);
            i++;
        }

        return ans;
    }
}
