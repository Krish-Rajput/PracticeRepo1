class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1;
        while(left<=right){
            if(nums[right]*nums[right]>nums[left]*nums[left]){
                arr[i]=nums[right]*nums[right];
                i--;right--;
            }else{
                arr[i]=nums[left]*nums[left];
                i--;left++;
            }
        }return arr;
    }
}