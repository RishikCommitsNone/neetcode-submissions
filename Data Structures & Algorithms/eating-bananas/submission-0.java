class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;
        while(l <= r){
            int mid = (l + r)/2;
            long res = 0;
            for(int i: piles){
                res += Math.ceil((double)i/mid); 
            }
            if(res <= h){
                ans = mid;
                r = mid - 1;

            }
            else{
                l = mid + 1;
            }
        }

        return ans;
    }
}
