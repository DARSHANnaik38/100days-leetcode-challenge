class Solution {
    public int pivotIndex(int[] nums) {
       int rightsum = 0;
       int leftsum = 0;
        for( int i : nums) {
            rightsum += i;
        }
        int val;
        for(int i = 0; i < nums.length; i++) {
            val = nums[i];
            rightsum -= val;
            if(leftsum ==  rightsum) {
                return i;
            }
            leftsum += val;
        }
        return -1;
    }
}