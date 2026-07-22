class Solution {
    public void rotate(int[] nums, int k) {
        int rot = k % nums.length;
        
        // 1. Poore array ko reverse karo
        reverse(nums, 0, nums.length - 1);
        // 2. Pehle 'rot' elements ko reverse karo
        reverse(nums, 0, rot - 1);
        // 3. Baaki bache hue elements ko reverse karo
        reverse(nums, rot, nums.length - 1);
    }
    
    // Helper method: Kisi bhi array ko di gayi range mein reverse karne ke liye
    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++; 
            right--;
        }
    }
}