import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int t=0;t<nums.length;t++){
            if(map.containsKey(nums[t])){
                return true;
            }map.put(nums[t],t);
        }
        return false;
    }
}
