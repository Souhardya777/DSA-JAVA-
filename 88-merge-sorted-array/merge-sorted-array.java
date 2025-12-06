class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr =new int[m+n];

        for(int i =0; i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i =0;i<n;i++){
            arr[(i+m)] = nums2[i];
        }

        int temp=0;
        for(int i =0;i<arr.length;i++){
            for(int j =(i+1); j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else{
                    continue;
                }
            } 
        }

        for (int i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
        }

        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}