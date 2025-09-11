import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Create an empty list to store the resulting triplets
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Sort the array to efficiently find triplets and handle duplicates
        Arrays.sort(nums);
        
        // 2. Iterate through the array to fix the first number
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // 3. Set up two pointers
            int left = i + 1;
            int right = nums.length - 1; // Correct initialization
            
            // 4. Use two-pointer approach to find the other two numbers
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if (currentSum == 0) {
                    // Found a triplet! Add it to the result list
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // 5. Move pointers to find other potential triplets
                    left++;
                    right--;
                    
                    // 6. Skip duplicates for the two pointers
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (currentSum < 0) {
                    // Sum is too small, need a larger number
                    left++;
                } else { // currentSum > 0
                    // Sum is too large, need a smaller number
                    right--;
                }
            }
        }
        
        return result;
    }
}