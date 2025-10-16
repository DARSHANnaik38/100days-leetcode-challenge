import java.util.Stack;

class Solution {
    public boolean isPalindrome(String s) {
        // Use StringBuilder without the generic type <Character>
        StringBuilder cleanedstring = new StringBuilder();

        for(char c : s.toCharArray()) {
            // Correct method name is isLetterOrDigit
            if(Character.isLetterOrDigit(c)) {
                // Use Character.toLowerCase() for a char
                cleanedstring.append(Character.toLowerCase(c));
            }
        }

        Stack<Character> checkingstack = new Stack<>();
        String finalstring = cleanedstring.toString();
        // String length is a method: length()
        int length = finalstring.length();
        int mid = length / 2;

        for(int i = 0 ; i < mid ; i++) {
            checkingstack.push(finalstring.charAt(i));
        }

        int secondhalf = (length % 2 == 0) ? mid : mid + 1;
        for(int j = secondhalf ; j < length ; j++) {
            // Typo fix: use checkingstack, not charstack
            if(checkingstack.isEmpty() || checkingstack.pop() != finalstring.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}