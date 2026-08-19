class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]+nums[i]==0){
                    res.add(Arrays.asList(nums[left],nums[right],nums[i]));
                    left++;
                    right--;
                    while(nums[left]==nums[left-1]&&left<right){
                        left++;
                    }
                    while(nums[right]==nums[right+1]&&left<right){
                        right--;
                    }
                }
                else if(nums[left]+nums[right]+nums[i]>0){
                    right--;
                }else{
                    left++;
                }
            }
        }return res;
    }
}