class Solution {
    public String gcdOfStrings(String str1, String str2) {



        if((str1+str2).equals(str2+str1)){
        
        int l1 = str1.length();
        int l2 = str2.length();
        int max =0;

        for( int i=1;i<=l2;i++){
            if(l1%i==0 && l2%i==0){
                max = i;
            }
        }
        return str2.substring(0,max);
    }
        else{
            return "";
        }
    }
}