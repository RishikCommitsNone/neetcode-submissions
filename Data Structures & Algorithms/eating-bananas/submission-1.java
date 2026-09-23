class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = 0;
        while(left <= right){
            int mid = (left + right)/2;
            long val = 0;
            for(int i : piles){
                val+= Math.ceil((double)i/mid);
            }
            if(val <= h){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
