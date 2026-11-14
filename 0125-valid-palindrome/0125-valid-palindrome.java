class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){
                left++;
                right--;
            }
            else if(!Character.isLetterOrDigit(s.charAt(left)))left++;
            else if(!Character.isLetterOrDigit(s.charAt(right)))right--;
            else return false;
        }return true;
    }
}