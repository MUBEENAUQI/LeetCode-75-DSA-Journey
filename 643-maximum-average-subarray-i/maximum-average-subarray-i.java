class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int l = nums.length;
        int left =0, right =0, sum =0, max = Integer.MIN_VALUE;
        double ans;
        
        while(right<l){
            if(right<k){
                //System.out.println("right = "+right);
                sum = sum + nums[right];
                //System.out.println("sum = "+sum);
                right++;
                
            }else{
                //System.out.println("right = "+right);
                sum = sum + nums[right];
                right++;
               // System.out.println("left = "+left);
                sum = sum - nums[left];
               // System.out.println("sum = "+sum);
                left++;
                
            }
            if( right>=k && max<sum ){
                max = sum;
               // System.out.println("max = "+max);
            }
        }
        ans = (double)max/k;
        return ans;      
    }
}