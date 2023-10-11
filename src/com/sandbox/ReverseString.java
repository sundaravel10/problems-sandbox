package com.sandbox;

public class ReverseString {
    class Solution {
        public void reverseString(char[] s) {
            int i = 0;
            int j = s.length - 1;
            for(;i < j; i++,j--){
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }
}
