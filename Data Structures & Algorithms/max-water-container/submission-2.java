class Solution {
    public int maxArea(int[] heights) {
        int ans = Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length - 1;

        while(l < r){
            ans = Math.max(ans, (r - l) * Math.min(heights[l], heights[r]));
            if(heights[l] > heights[r]){
                r--;
            }
            else{
                l++;
            }
        }

        return ans;
    }
}
