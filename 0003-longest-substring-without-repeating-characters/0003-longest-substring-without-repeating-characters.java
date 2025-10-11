class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Use a Set to store characters in the current window (O(1) average time lookup)
        Set<Character> charSet = new HashSet<>();
        
        int left = 0;              // The left pointer of the sliding window
        int maxLength = 0;         // Stores the maximum length found so far
        
        // The right pointer iterates through the string to expand the window
        for (int right = 0; right < s.length(); right++) {
            
            // 1. Contract the window from the left (Handling Duplicates)
            // If the character at 'right' is ALREADY in the set, shrink the window.
            while (charSet.contains(s.charAt(right))) {
                // Remove the character at the 'left' pointer
                charSet.remove(s.charAt(left));
                // Move the left pointer one step to the right
                left++;
            }
            
            // 2. Expand the window (Add the new character)
            // Add the current character (s.charAt(right)) to the set.
            charSet.add(s.charAt(right));
            
            // 3. Update Max Length
            // The length of the current valid window is 'right - left + 1'
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}