class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodleft=1;int prodright=1;
        for(int i=1;i<nums.length;i++){
            prodright=prodright*nums[i];
        }int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=prodleft*prodright;
            prodleft*=nums[i];
            if(i!=nums.length-1){
                if(nums[i+1]==0){
                    prodright=1;
                    for(int j=i+2;j<nums.length;j++){
                        prodright*=nums[j];
                    }
                }
                else{
                    prodright/=nums[i+1];
                }
            }
        }
        return res;
    }
}