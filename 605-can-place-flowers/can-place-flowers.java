class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s = flowerbed.length;

        if(n==0)
        return true;

        if(s==1 && flowerbed[0] == 0){
            if(n==1)
            return true;
            else
            return false;
        }

        if(s==2 && (flowerbed[0] == 1 ||flowerbed[1] == 1)){
            return false;
        }

        int f = flowerbed[0];
        for(int i=0;i<flowerbed.length-1;i++){
            
            if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && f==0){
                n--;
                f=1;
            }
            else{
                f=flowerbed[i];
            }

            if(n==0){
                return true;
            }
        }

        if(flowerbed[s-1] == 0 && flowerbed[s-2] == 0 && f==0)
         n--;

        if(n==0)
            return true;        
        else
            return false;
    }
}