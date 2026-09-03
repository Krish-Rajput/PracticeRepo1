class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++){
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0||j==i-1){
                    ans.add(1);
                }
                else{
                    ans.add(res.get(i-2).get(j-1)+res.get(i-2).get(j));
                }
            }
            res.add(ans);
        }
        return res.get(rowIndex);
    }
}