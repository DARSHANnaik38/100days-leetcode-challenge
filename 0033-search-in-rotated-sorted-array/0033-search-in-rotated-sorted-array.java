class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Case 1: The left half is sorted
            if (nums[left] <= nums[mid]) {
                // Check if the target is in the left half
                if (nums[left] <= target && target < nums[mid]) {
                    // Target is in the sorted left part, so discard the right half
                    right = mid - 1;
                } else {
                    // Target must be in the unsorted right part
                    left = mid + 1;
                }
            } 
            // Case 2: The right half is sorted
            else { 
                // Check if the target is in the right half
                if (nums[mid] < target && target <= nums[right]) {
                    // Target is in the sorted right part, so discard the left half
                    left = mid + 1;
                } else {
                    // Target must be in the unsorted left part
                    right = mid - 1;
                }
            }
        }
        
        // Target was not found
        return -1;
    }
}