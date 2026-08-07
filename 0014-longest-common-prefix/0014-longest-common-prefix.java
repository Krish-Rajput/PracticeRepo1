class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=strs[0].length();
        String s=strs[0];
        for(int i=0;i<strs.length;i++){
            if(strs[i]==""){
                return "";
            }int ct=0;
            if(l>strs[i].length()){
                l=strs[i].length();
            }
            for(int j=0;j<l;j++){
                if(s.charAt(j)==strs[i].charAt(j)){
                    ct++;
                }else{
                    if(l>ct){
                        l=ct;
                    }ct=0;break;
                }
            }
        }return s.substring(0,l);
    }
}