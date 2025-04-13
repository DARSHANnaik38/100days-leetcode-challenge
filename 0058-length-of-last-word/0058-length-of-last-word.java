class Solution {
    public int lengthOfLastWord(String s) {
        int length=s.length()-1;
        // StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = length; i >= 0;i--) {
            if(s.charAt(i) != ' ') {
                count++;
            }
            else{
                if(count > 0){
                    return count;
                }
            }
        }
        return count;
        
    }
}