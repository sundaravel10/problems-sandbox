package com.sandbox;

public class LongestRepeatingCharacterReplacement {
    class Solution {
        public int characterReplacement(String s, int k) {
            int[] arr = new int[26];
            int largestCount = 0;
            int begin = 0;
            int maxLen = 0;
            for(int end = 0; end < s.length(); end++){
                arr[s.charAt(end) - 'A']++;
                largestCount = Math.max(largestCount,arr[s.charAt(end) - 'A']);
                if(end - begin + 1 - largestCount > k){
                    arr[s.charAt(begin) - 'A']--;
                    begin++;
                }

                maxLen = Math.max(maxLen, end - begin + 1);
            }

            return maxLen;
        }
    }
}
