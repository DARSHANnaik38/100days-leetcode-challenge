class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        int curr;
        while(x > 0) {
        curr = x % 10;
        x = x / 10;
        reverse = reverse * 10 + curr;
        }

        return reverse == original;
    }
}