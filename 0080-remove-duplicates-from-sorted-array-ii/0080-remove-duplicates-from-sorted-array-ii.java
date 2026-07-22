class Solution {
    public int removeDuplicates(int[] nums) {
        int ct=1;
        int curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ct++;
            }
            else{
                ct=1;
            }
            if(ct<=2){
                nums[curr]=nums[i];
                curr++;
            }
        }return curr;
    }
}