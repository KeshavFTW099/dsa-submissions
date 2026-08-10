class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Array to store character counts for 'a' through 'z'
        int[] count = new int[26]; //each count is a alphabet eg a0, b1

        // Loop through both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            // Increment for character in s
            count[s.charAt(i) - 'a']++;
            // Decrement for character in t
            count[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}