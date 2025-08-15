class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int[] customerwealth : accounts) {
            int currentwealth = 0;
            for(int values : customerwealth) {
                currentwealth += values;
            }

            // Corrected the typo from 'currentweath' to 'currentwealth'
            if(currentwealth > maxwealth) {
                maxwealth = currentwealth;
            }
        }
        
        // Moved the return statement outside the loop
        return maxwealth;
    }
}