class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] p = new int[l];
        int[] s = new int[l];
        p[0] = 1;
        int flag =0;
        for(int i=0;i<l;i++){
            flag = nums[i]*p[i];
            if(i!=l-1)
            p[i+1] = flag;
        } 

        s[l-1] = 1;

        for(int i=l-1;i>=0;i--){
            flag = nums[i]*s[i];
            if(i!=0)
            s[i-1] = flag;
            
        } 
        for(int i=0;i<l;i++){
            s[i] = s[i]*p[i];
        }
        return s;
    }
}