class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int s=0,e=l-1;
    
        while(s<=e){
            if(nums[s]==0){
                for(int i=s;i<e;i++){
                    nums[i]=nums[i+1];
                }
                nums[e]=0;
                e--;
            }else{
                s++;
            }
        }
    }
}