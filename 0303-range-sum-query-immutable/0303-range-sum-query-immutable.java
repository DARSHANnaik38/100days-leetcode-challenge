class NumArray {
    private final int[] prefixsum;

    public NumArray(int[] nums) {
        this.prefixsum = new int[nums.length + 1];

        for(int i = 0 ; i < nums.length ; i++) {
            prefixsum[i + 1] = prefixsum[i] + nums[i];
        }
        // this.prefixsum = nums;
    }
    
    public int sumRange(int left, int right) {
        // if(left == 0) {
        //     return 0;
        // }
        return prefixsum[right + 1] - prefixsum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */