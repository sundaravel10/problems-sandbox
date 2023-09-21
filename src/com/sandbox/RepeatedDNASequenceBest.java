package com.sandbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequenceBest {

    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            Set<String> foundSet = new HashSet<>();
            Set<String> resultSet = new HashSet<>();
            for(int i = 0; i + 9 < s.length(); i++){
                String tempString = s.substring(i,i+10);
                if(!foundSet.add(tempString)){
                    resultSet.add(tempString);
                }
            }
            return new ArrayList(resultSet);
        }
    }
}
