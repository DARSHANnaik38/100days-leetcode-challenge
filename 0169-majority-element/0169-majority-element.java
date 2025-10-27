class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer , Integer> frequencymap = new HashMap<>();
        for(int num : nums) {
            int currentcount = frequencymap.getOrDefault(num , 0);
            frequencymap.put(num , currentcount + 1);
        }

        int threshold = nums.length / 2;

        for(Map.Entry<Integer , Integer> entry : frequencymap.entrySet()) {
            if(entry.getValue() > threshold) {
                return entry.getKey();
            }
        }
        return -1;
    }
}