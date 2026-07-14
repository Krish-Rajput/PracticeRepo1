class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int currmax=width*Math.min(height[left],height[right]);
            if(currmax>maxarea){
                maxarea=currmax;
            }
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }return maxarea;
    }
}