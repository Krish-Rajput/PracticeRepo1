class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1=0;
        int curr1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr1++;
                if(max1<curr1){
                    max1=curr1;}
            }else{
                if(max1<curr1){
                    max1=curr1;
                }curr1=0;
            }
        }return max1;
    }
}