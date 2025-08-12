class Solution {
    public void reverseString(char[] s) {
        reverseString(s , 0 , s.length - 1);
    }

    private static void reverseString(char[] s , int left , int right) {
        if(left >= right) {
            return;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverseString(s , left + 1 , right - 1);
        
    }
}