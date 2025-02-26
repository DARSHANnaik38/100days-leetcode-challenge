class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 1) {
                mid--;
            } 
             if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid - 1;
            }

        }
        return nums[start];

    }
}