class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> m =new HashMap<>();
        PriorityQueue<int[]> max_heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        for(int x : nums){
            m.merge(x, 1, Integer::sum);
        }
        for(var e : m.entrySet()){
            max_heap.offer(new int[]{e.getKey(), e.getValue()});
            while(max_heap.size() > k)
                max_heap.poll();
        }

        int[] ans = new int[max_heap.size()];
        int i = 0;
        for(int[] pair: max_heap){
            ans[i++] = pair[0];
        }
        return ans;
    }
}
