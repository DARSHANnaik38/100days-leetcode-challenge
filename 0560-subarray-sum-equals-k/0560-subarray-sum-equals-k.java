class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer , Integer> prefixrecord = new HashMap<>();
        prefixrecord.put(0 , 1);
        int curr_sum = 0;
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++) {
            curr_sum += nums[i];
            if(prefixrecord.containsKey(curr_sum - k )) {
                count += prefixrecord.get(curr_sum - k);
            } 
            prefixrecord.put(curr_sum , prefixrecord.getOrDefault(curr_sum , 0) + 1);
        }
        return count;
    }
}