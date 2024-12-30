class Solution {
    public int maxArea(int[] height) {
            int l = height.length;
            int s=0,e=l-1;
            int h,b,max=0;

            while(s<e){
                h = Math.min(height[s],height[e]);
                b = e-s;
                System.out.println("h= "+h+" b= "+b);
                if((h*b)>max){
                max = h*b;
                }
                if(h==height[s])
                s++;
                else
                e--;
            }

            return max;
        
    }
}