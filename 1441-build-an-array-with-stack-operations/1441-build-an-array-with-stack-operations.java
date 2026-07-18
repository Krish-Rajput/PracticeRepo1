import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        int i=0;
        int dig=1;
        int p=0;
        while(i<target.length){
            res.add("Push");
            p++;
            if(dig!=target[i]){
                res.add("Pop");
                p--;i--;
            }i++;dig++;
        }
        return res;
    }
}