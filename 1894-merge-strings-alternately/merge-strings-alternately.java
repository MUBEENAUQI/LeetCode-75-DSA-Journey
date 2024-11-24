class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int i=0;
        while(i<l1 && i<l2){
            ans = ans.append(word1.charAt(i));
            ans = ans.append(word2.charAt(i));
            i++;
        }

        if(i<l1){
            ans = ans.append(word1.substring(i,l1));
        }
        if(i<l2){
            ans = ans.append(word2.substring(i,l2));
        }

        return ans.toString();
        //Solution 1 
        // here time complexity = O(n2)
        /*
        String ans = word2;
        int l1 = word1.length();
        int l2 = word2.length();
        int c =0 ;

        if(l2>l1){
            word2 = word1;
            word1 = ans;
            l1  = word1.length();
            l2 = word2.length();
            c=1;
        }
        ans = "";
        char ch;

        for (int i=0;i<l2;i++){
            if(c==0){
                ch = word1.charAt(i);
                ans = ans+ch;
                ch = word2.charAt(i);
                ans = ans+ch;
            }
            if(c==1){
                ch = word2.charAt(i);
                ans = ans+ch;
                ch = word1.charAt(i);
                ans = ans+ch; 
            }
        }

        ans = ans + word1.substring(l2,l1);

        return ans.trim();
        */ 
    }
}