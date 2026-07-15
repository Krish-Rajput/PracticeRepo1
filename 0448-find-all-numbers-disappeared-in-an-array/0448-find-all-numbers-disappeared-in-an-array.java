class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> n=new ArrayList<>();
        int[] visited=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            visited[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(visited[i]==0){
                n.add(i);
            }
        }return n;
    }
}