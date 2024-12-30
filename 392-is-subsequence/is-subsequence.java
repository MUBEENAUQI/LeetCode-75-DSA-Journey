class Solution {
    public boolean isSubsequence(String s, String t) {

        int l = t.length();
        int l1 = s.length();
        int j = 0,f=0;
        if (l1 ==0)
        return true;
        for(int i=0;i<l;i++){
            if(t.charAt(i)==s.charAt(j)){
                System.out.println("i= "+i+ " j= "+j );
                j++;
                if (j==l1){
                    f=1;
                    break;
                }
            }
            
        }
        if(f==1)
        return true;
        else
        return false;
        
    }
}