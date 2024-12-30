class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int f =0,s=0;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                f++;
            }else{
                nums[s] = nums[i];
                s++;
            }
        }
            l=l-1;
            while(f>0){
                nums[l] =0;
                f--;
                l--;
            }
        //logic 1 (65 ms)
        // int s=0,e=l-1;
        // while(s<=e){
        //     if(nums[s]==0){
        //         for(int i=s;i<e;i++){
        //             nums[i]=nums[i+1];
        //         }
        //         nums[e]=0;
        //         e--;
        //     }else{
        //         s++;
        //     }
        // }
    }
}