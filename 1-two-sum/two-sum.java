class Solution {
    public int[] twoSum(int[] nums, int target) {

        int l = nums.length;
        int a=0;
        int b=0;
        int flag =0;

       for(int i=0;i<l-1;i++){
        for(int j=i+1;j<l;j++){
            if(nums[i]+nums[j]==target){
                a = i;
                b = j;
                flag =1;
                break;
            }
        }
        if (flag == 1)
        break;
       }

      
       return new int[]{a,b};
    }
}