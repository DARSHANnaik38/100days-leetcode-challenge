class Solution {
    public int totalFruit(int[] fruits) {
        int windowstart = 0;
        int length = 0;

        // Set<Integer> fruitset = new HashSet<>();
        Map<Integer,Integer> fruitfreq = new HashMap<>();
        for(int windowend = 0 ; windowend < fruits.length ; windowend++) {
            int rightfruit = fruits[windowend];

            fruitfreq.put(rightfruit , fruitfreq.getOrDefault(rightfruit , 0) + 1);
            while(fruitfreq.size() > 2) {
                int leftfruit = fruits[windowstart];
                fruitfreq.put(leftfruit , fruitfreq.get(leftfruit) - 1);

                if(fruitfreq.get(leftfruit) == 0) {
                    fruitfreq.remove(leftfruit);
                }
                windowstart++;
            }
            length = Math.max(length , windowend - windowstart + 1);
        }
        return length;
    }
}