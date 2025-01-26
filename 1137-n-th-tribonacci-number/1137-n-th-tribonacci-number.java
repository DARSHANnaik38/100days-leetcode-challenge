class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
         else if(n==2){
            return 1;
        }
        else{
            int first=0;
            int second=1;
            int third=1;
            int current=0;
            for(int i=3;i<=n;i++){
                current=third+second+first;
                first=second;
                second=third;
                third=current;

            }
            return current;
        }
        
    }
}