class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = 0;

        // Traverse both strings
        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++; // Move sPointer when characters match
            }
            tPointer++; // Always move tPointer
        }

        // If sPointer has reached the end of s, all characters were matched
        return sPointer == s.length();
        // int l = t.length();
        // int l1 = s.length();
        // int j = 0,f=0;
        // if (l1 ==0)
        // return true;
        // for(int i=0;i<l;i++){
        //     if(t.charAt(i)==s.charAt(j)){
        //         System.out.println("i= "+i+ " j= "+j );
        //         j++;
        //         if (j==l1){
        //             f=1;
        //             break;
        //         }
        //     }
            
        // }
        // if(f==1)
        // return true;
        // else
        // return false;
        
    }
}