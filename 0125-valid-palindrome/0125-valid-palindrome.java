class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // s = s.toLowerCase();
        while(left < right) {
            // if(s.charAt(left) != s.charAt(right)) {
            //     return false;
            // }
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;




        }
        return true;
    }
}