class Solution {
    public static int removeElement(int[] nums, int val) {
        int c = nums.length;
        for (int i =0; i<c;i++){
            if(nums[i]==val){
                for(int j =i; j<c-1; j++){
                    nums[j]=nums[j+1];
                }
                c--;
                i--;
            }
        }
        return c;
    }
}