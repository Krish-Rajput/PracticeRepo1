class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr=new int[grid.length*grid.length+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                arr[grid[i][j]]+=1;
            }
        }
        int rep=0;
        int mis=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                rep=i;
            }
            if(arr[i]==0){
                mis=i;
            }
        }
        int[] res={rep,mis};
        return res;
    }
}