class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i]; // Squaring each element
        }
        Arrays.sort(nums);
        return nums;
        
    }
}