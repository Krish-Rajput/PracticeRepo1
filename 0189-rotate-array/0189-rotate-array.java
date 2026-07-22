class Solution {
    public void rotate(int[] nums, int k) {
        int rot=k%nums.length;
        int[] arr=new int[rot];int[] arr2=new int[nums.length-rot];
        int j=0;
        for(int i=nums.length-rot;i<nums.length;i++){
            arr[j]=nums[i];
            j++;
        }
        j=0;
        for(int i=0;i<nums.length-rot;i++){
            arr2[j]=nums[i];
            j++;
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        j=0;
        for(int i=arr.length;i<nums.length;i++){
            nums[i]=arr2[j];j++;
        }
    }
}