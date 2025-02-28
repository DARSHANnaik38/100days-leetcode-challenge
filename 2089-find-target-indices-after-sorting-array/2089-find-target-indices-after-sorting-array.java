class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int tcount=0;
        int smallnum=0;
        for(int ele:nums){
            if(ele==target){
                tcount++;

            }
            else if(ele<target){
                smallnum++;
            }
        }
        List<Integer> li=new ArrayList<>();
        while(tcount>0){
            li.add(smallnum);
            smallnum++;
            tcount--;
        }
        return li;
        
    }
}