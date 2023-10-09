package com.sandbox;

import java.util.*;

public class ArrayIntersection {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Map<Integer,Integer> intersectionMap = new HashMap<>();
            int maxLen = (nums1.length > nums2.length) ? nums1.length:nums2.length;
            int i;
            Set<Integer> resultSet = new HashSet<>();
            for( i = 0; i < nums1.length; i++){
                if(!intersectionMap.containsKey(nums1[i])){
                    intersectionMap.put(nums1[i],1);
                }
            }
            for(i = 0; i < nums2.length; i++){
                if(intersectionMap.containsKey(nums2[i])){
                    resultSet.add(nums2[i]);
                }
            }
            int setSize = resultSet.size();
            int[] nums3 = new int[setSize];
            Iterator<Integer> iterator = resultSet.iterator();
            int j = 0;
            while(iterator.hasNext()){
                nums3[j] = iterator.next();
                j++;
            }
            return nums3;
        }
    }
}
