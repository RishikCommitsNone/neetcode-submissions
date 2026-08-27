class Solution {
    public int maxArea(int[] height) {
                int l = 0;
        int r = height.length - 1;
        int mSum = -1;
        while(l < r){
            mSum = Math.max((r - l) * Math.min(height[l], height[r]), mSum);
            if(height[l] > height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return mSum;
    }
}
