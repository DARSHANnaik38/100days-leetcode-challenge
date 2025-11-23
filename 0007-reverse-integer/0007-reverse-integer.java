class Solution {
    public int reverse(int x) {
        long revnum = 0;
        // int lastdigit = 0;
        while(x != 0) {
            int lastdigit = x % 10;
            revnum = revnum * 10 + lastdigit;
            x /= 10; 
        }
        if(revnum > Integer.MAX_VALUE || revnum < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)revnum;
    }
}