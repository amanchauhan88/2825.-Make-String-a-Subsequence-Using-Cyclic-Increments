class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        // If str2 is longer than str1, it's impossible to make it a subsequence
        if (str2.length() > str1.length()) {
            return false;
        }

        int i = 0, j = 0;

        // Iterate through both strings
        while (i < str1.length() && j < str2.length()) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(j);

            // Check if characters match or can match after one cyclic increment
            if (ch1 == ch2 || (ch1 + 1 - 'a') % 26 == ch2 - 'a') {
                j++; // Move to the next character in str2
            }
            i++; // Move to the next character in str1
        }

        // If we've matched all characters in str2, return true
        return j == str2.length();
    }
}
