class Solution {
    public String reverseVowels(String s) {
        int j = s.length()-1;
        StringBuilder s1= new StringBuilder(s);
        s = "aeiouAEIOU";
        int i = 0;
        char temp ;
        while(j>i){
            if ((s.indexOf(s1.charAt(i)) != -1) && (s.indexOf(s1.charAt(j)) != -1)) {
                temp = s1.charAt(i);
                s1.setCharAt(i, s1.charAt(j));
                s1.setCharAt(j, temp);
                i++;
                j--;
             }else if(s.indexOf(s1.charAt(i)) == -1){
                i++;
             }else if(s.indexOf(s1.charAt(j)) == -1){
                j--;
             }             
        }
        return s1.toString();
        
    }
}