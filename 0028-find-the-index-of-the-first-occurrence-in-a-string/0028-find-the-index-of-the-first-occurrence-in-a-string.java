class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean match = true;
            for (int j = 0; j < needle.length(); j++) {
                // Correct logic: check for a mismatch
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false; // Mismatch found
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }
}