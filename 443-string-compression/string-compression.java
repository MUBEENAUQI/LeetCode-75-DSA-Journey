class Solution {
    public int compress(char[] chars) {
        int l = chars.length;
        if (l == 1) return 1;

        int count = 1;
        int j = 0; // Pointer to update chars in place

        for (int i = 1; i < l; i++) {
            // Check if the current character matches the previous one
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                // Write the character and its count (if > 1) to the array
                chars[j++] = chars[i - 1];
                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (char c : countStr.toCharArray()) {
                        chars[j++] = c;
                    }
                }
                count = 1; // Reset the count for the new character
            }
        }

        // Handle the last group
        chars[j++] = chars[l - 1];
        if (count > 1) {
            String countStr = Integer.toString(count);
            for (char c : countStr.toCharArray()) {
                chars[j++] = c;
            }
        }

        return j; // New length of the compressed array
    }
}
