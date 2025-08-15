class Solution {
    public int[] runningSum(int[] nums) {
        final int[] runningnum = {0};

        return Arrays.stream(nums)
                                .map(num -> runningnum[0] += num)
                                .toArray();
}
}