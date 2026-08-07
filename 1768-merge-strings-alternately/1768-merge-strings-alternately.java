class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s= new StringBuilder();
        int l1=word1.length();
        int l2=word2.length();
        if(l1==l2){
            for(int i=0;i<l1;i++){
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
            }
        }else if(l1>l2){
            for(int i=0;i<l2;i++){
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
            }
            for(int i=l2;i<l1;i++){
                s.append(word1.charAt(i));
            }
        }else if(l2>l1){
            for(int i=0;i<l1;i++){
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
            }
            for(int i=l1;i<l2;i++){
                s.append(word2.charAt(i));
            }
        }return s.toString();
    }
}