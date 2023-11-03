package com.sandbox;

public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            // Using Boyer-Moore Majority Vote Algorithm
            int count = 0;
            int majority = 0;

            for(int i = 0; i < nums.length; i++){
                if(count == 0 && majority != nums[i]){
                    count = 1;
                    majority = nums[i];
                }else if(majority == nums[i]){
                    count++;
                }else{
                    count--;
                }
            }

            return majority;
        }
    }
}
