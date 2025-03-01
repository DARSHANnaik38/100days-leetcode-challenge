import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        // Fix: Convert all numbers to strings (loop runs till nums.length)
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] + "";
        }

        // Fix: Correct sorting order (descending)
        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // Fix: Handle leading zeros (e.g., [0,0] should return "0")
        if (arr[0].equals("0")) {
            return "0";
        }

        // Construct the largest number
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {  // Fix: Use arr.length instead of nums.length
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
