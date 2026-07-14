class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1;
        while(left<=right){
            if(Math.pow(nums[right],2)>Math.pow(nums[left],2)){
                arr[i]=(int)Math.pow(nums[right],2);
                i--;right--;
            }else{
                arr[i]=(int)Math.pow(nums[left],2);
                i--;left++;
            }
        }return arr;
    }
}