class Solution {
    public int maxWidthRamp(int[] nums) {
        int[] arb=new int[nums.length];
        int len=0;
        arb[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            arb[i]=Math.max(arb[i+1],nums[i]);
        }
        int left=0;
        int right=0;
        while(right<nums.length){
            while(left<right && nums[left]>arb[right]){
                left++;
            }len=Math.max(len,right-left);right++;
        }return len;
    }
}