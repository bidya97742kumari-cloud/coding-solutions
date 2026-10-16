class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;   // index in s
        int j = 0;   // index in t

        while (i < s.length() && j < t.length()) {
            char sChar = s.charAt(i);   // stored character of s
            char tChar = t.charAt(j);   // stored character of t

            if (sChar == tChar) {
                i++;        // matched, move to next char of s
            }
            j++;            // always move forward in t
        }

        return i == s.length();   // true if all of s was matched
    }
}