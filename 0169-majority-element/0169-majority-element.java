class Solution {
    public int majorityElement(int[] nums) {
        int ct=0;
        int cand=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==cand){
                ct++;
            }else{
                ct--;
            }
            if(ct<=0){
                cand=nums[i];
                ct=1;
            }
        }return cand;
    }
}