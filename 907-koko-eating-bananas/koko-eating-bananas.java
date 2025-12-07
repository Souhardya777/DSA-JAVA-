class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high =0;
        for(int e : piles){
            if(e>high)
            high=e;
        }
        int low = 1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(hour(piles,mid)<=h){
                high = mid;
            }
            else
                low = mid+1;
        }
        return low;
    }

    private long hour(int[] piles, int k){
        long total =0L;
        for(int p : piles){
            total += Math.ceil((double)p/k);
        }
        return total;
    }
}