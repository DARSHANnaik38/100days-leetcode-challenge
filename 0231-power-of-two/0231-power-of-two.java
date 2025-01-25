class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero cannot be powers of two.
        }
        if (n == 1) {
            return true; // 1 is a power of two (2^0 = 1).
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false; // If `n` is not divisible by 2, it's not a power of two.
            }
            n = n / 2; // Divide `n` by 2.
        }
        return true; // If we reach this point, `n` is a power of two.
    }
}
