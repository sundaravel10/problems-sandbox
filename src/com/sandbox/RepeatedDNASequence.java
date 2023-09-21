package com.sandbox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedDNASequence {

    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            Map<String,Integer> countMap = new HashMap<>();
            for(int i = 0, j = i + 9; j <= s.length() - 1; i++,j++){
                System.out.println("i and j " + i + " " + j);
                String tempString = s.substring(i,j+1);
                System.out.println(tempString);
                if(!countMap.containsKey(tempString)){
                    countMap.put(tempString,1);
                }else{
                    countMap.put(tempString,countMap.get(tempString) + 1);
                }
            }

            List<String> resultList = countMap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry-> entry.getKey()).collect(Collectors.toList());

            resultList.stream().forEach(str -> System.out.println(str));
            return resultList;
        }
    }
}
