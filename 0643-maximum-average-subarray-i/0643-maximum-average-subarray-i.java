class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double csum=0;
        double sum=0;
        for(int i=0;i<k;i++){
            csum+=nums[i];
        }sum=csum;
        for(int i=k;i<nums.length;i++){
            csum=csum+nums[i]-nums[i-k];
            if(csum>sum){
                sum=csum;
            }
        }
        return (double) sum/k;
    }
}