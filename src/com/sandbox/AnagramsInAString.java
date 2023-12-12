package com.sandbox;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsInAString {
    class Solution {
        public List<Integer> findAnagrams(String input, String target) {
            int n = input.length();
            int m = target.length();
            int[] l = new int[26];
            int[] k = new int[26];

            for(char c:target.toCharArray()){
                k[c - 'a']++;
            }

            int i = 0,j = 0;
            List<Integer> resultList = new ArrayList<>();
            while(j < n){
                l[input.charAt(j) - 'a']++;
                if(j - i + 1 <m){
                    j++;
                }else{
                    if(Arrays.equals(l,k)){
                        resultList.add(i);
                    }
                    l[input.charAt(i) - 'a']--;
                    i++;
                    j++;

                }
            }

            return resultList;

        }

    }
}
