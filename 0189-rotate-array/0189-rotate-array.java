class Solution {
    public void rotate(int[] nums, int k) {
        int rot=k%nums.length;
        int left=0;int right=nums.length-1;
        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;right--;
        }
        left=0;right=rot-1;
        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;right--;
        }left=rot;right=nums.length-1;
        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;right--;
        }
    }
}