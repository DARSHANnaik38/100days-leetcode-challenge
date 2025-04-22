class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i : nums) {
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
         for (int key : hs.keySet()) {
            if (hs.get(key) == 1) {
                return key;
            }
        }
        return -1;
        
    }
}