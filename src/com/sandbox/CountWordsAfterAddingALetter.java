package com.sandbox;

import java.util.Arrays;

public class CountWordsAfterAddingALetter {
    class Solution {
        public int wordCount(String[] startWords, String[] targetWords) {

            int[] alphaArr = new int[26];
            int count = 0;
            for(int i = 0; i < targetWords.length; i++){
                for(int j = 0;j < startWords.length; j++){
                    boolean flag = true;
                    if(targetWords[i].length() == startWords[j].length() + 1){
                        char[] tArr = targetWords[i].toCharArray();
                        char[] sArr = startWords[j].toCharArray();
                        for(int k = 0; k<tArr.length;k++){
                            alphaArr[(int)tArr[k] - 'a']++;
                        }
                        for(int m = 0;m < sArr.length; m++){
                            if(alphaArr[(int)sArr[m] - 'a'] == 0){
                                flag = false;
                                break;
                            }
                        }
                        Arrays.fill(alphaArr,0);
                        if(flag == true){
                            count++;
                            break;
                        }
                    }else{
                        flag =  false;
                    }
                }
            }
            return count;
        }
    }
}
