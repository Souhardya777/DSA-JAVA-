class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        for(int i =0; i<r;i++){
            int c = matrix[i].length-1;
            if(target>=matrix[i][0] && target<=matrix[i][c]){
                int low =0;
                int high = c+1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(matrix[i][mid]==target)
                        return true;
                    else if (matrix[i][mid]<target)
                        low=mid+1;
                    else if (matrix[i][mid]>target)
                        high = mid-1;
                }
            }
        }
        return false;
       
    }
}