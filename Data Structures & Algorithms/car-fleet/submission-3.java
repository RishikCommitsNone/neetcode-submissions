class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] main = new int[position.length][2];

        for(int i = 0; i < position.length; i++){
            main[i][0] = position[i];
            main[i][1] = speed[i];
        }

        Arrays.sort(main, (a,b) -> Integer.compare(b[0], a[0]));
        int ans = 1;
        double curr_min = (double) (target - main[0][0])/main[0][1];
        for(int i = 1; i < position.length; i++){
            double s =(double) (target - main[i][0])/main[i][1];

            if(s > curr_min){
                ans++;
                curr_min = s;
            }
        }

        return ans;
    }
}
