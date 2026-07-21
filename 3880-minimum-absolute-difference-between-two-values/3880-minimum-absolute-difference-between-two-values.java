class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=nums.length+1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1&&nums[j]==2){
                    if(min>Math.abs(i-j)){
                        min=Math.abs(i-j);
                    }
                }
            }
        }if(min==nums.length+1){
            return -1;
        }else{
            return min;
        }
        
    }
}