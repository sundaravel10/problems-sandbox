package com.sandbox;

public class ReverseWordsInAString {

    class Solution {
        public String reverseWords(String s) {
            String[] strArr = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            sb.append(strArr[strArr.length - 1]);
            for(int i = strArr.length - 2; i >= 0; i-- ){
                sb.append(" ");
                sb.append(strArr[i]);
            }
            return sb.toString().trim();
        }
    }
}
