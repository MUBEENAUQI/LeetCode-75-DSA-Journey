class Solution {
    public int maxVowels(String s, int k) {
        int len = s.length();
        int maxVowels = 0, currentVowels = 0;

        // Count vowels in the first window (first k characters)
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }

        maxVowels = currentVowels;

        // Slide the window across the string
        for (int i = k; i < len; i++) {
            // Remove the effect of the character going out of the window
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }

            // Add the effect of the character coming into the window
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }

            // Update the maxVowels if necessary
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

// class Solution {
//     public int maxVowels(String s, int k) {

//         int len = s.length();
//         int l=0,r=0,f=0,max=0;
        
//         while(r!=len){
//             char c = s.charAt(r);
//             if(r<k){
//                 if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
//                 f++;
//                 r++;
//             }else{
//                 if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
//                 f++;
//                 c = s.charAt(l);
//                 if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
//                 f--;
//                 l++;
//                 r++;
//             }
//             if(f>max)
//             max = f;
//             if(max ==k)
//             break;
//         }
//         return max;

//         // time exceeded
//         // int len = s.length();
//         // int f=0,max=0;;
//         // int l=0,r=k;
//         // String tmp ="";

//         // while(r!=len+1){
//         //     tmp = s.substring(l,r);
//         //     // System.out.println("temp= "+tmp);
//         //     // System.out.println("l= "+l+" r= "+r);

//         //     for(int i =0;i<tmp.length();i++){
//         //         char c = tmp.charAt(i);
//         //          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
//         //        f++;
//         //     }

//         //     if(f>max)
//         //     max=f;
//         //     System.out.println("f = "+f);
//         //     f=0;
//         //     l++;
//         //     r++;
//         // }
//         // return max;
//     }
// }