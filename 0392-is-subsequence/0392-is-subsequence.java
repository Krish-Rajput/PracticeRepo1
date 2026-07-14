class Solution {
    public boolean isSubsequence(String s, String t) {
        int p=0;
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<t.length();i++){
            if(p<s.length()&&t.charAt(i)==s.charAt(p)){
                p++;
            }
        }
        System.out.print(p);
        if(p==s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}