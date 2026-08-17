import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int left=0;
        int maxlen=0;
        int clen=0;
        HashMap<Character,Integer> m=new HashMap<>();
        for(int right=0;right<s.length();right++){
            if(m.containsKey(s.charAt(right))){
                left=Math.max(left,m.get(s.charAt(right))+1);
            }m.put(s.charAt(right),right);
            maxlen=Math.max(maxlen,right-left+1);
        }return maxlen;
    }
}