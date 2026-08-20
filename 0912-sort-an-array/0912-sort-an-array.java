class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public void merge(int[] arr,int left,int mid,int right){
        int sl=mid-left+1;
        int rl=right-mid;
        int[] la=new int[sl];
        int[] ra=new int[rl];
        for(int i=0;i<sl;i++){
            la[i]=arr[left+i];
        }
        for(int i=0;i<rl;i++){
            ra[i]=arr[mid+i+1];
        }
        int i = 0, j = 0;
        int k = left;

        while (i < sl && j < rl) {
            if (la[i] <= ra[j]) {
                arr[k] = la[i];
                i++;
            } else {
                arr[k] = ra[j];
                j++;
            }
            k++;
        }
        while (i < sl) {
            arr[k] = la[i];
            i++;
            k++;
        }

        while (j < rl) {
            arr[k] = ra[j];
            j++;
            k++;
        }
    }
}