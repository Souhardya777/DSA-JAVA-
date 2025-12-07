//class Solution {
//    public int minEatingSpeed(int[] piles, int h) {
//        int high =0;
//        for(int e : piles){
//            if(e>high)
//            high=e;
//        }
//        int low = 1;
//        while(low<high){
//            int mid = low+(high-low)/2;
//            if(hour(piles,mid)<=h){
//                high = mid;
//            }
//            else
//                low = mid+1;
//        }
//        return low;
//    }

//    private long hour(int[] piles, int k){
//        long total =0L;
//        for(int p : piles){
//            total += (p+k-1)/k;
//        }
//        return total;
//    }
//}

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int n = piles.length;
        long total = 0;
        int s =0;
        for (int p : piles){
            total += p;
            if(p > s)
                s=p;
        }
        
        int left = (int) Math.ceil((double)(total/h));
        int right = s;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int time = 0;
            for (int p : piles) {
                time += Math.ceil((double)p/ mid);
            }
            if (time > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}