package com.sandbox;

public class MaxSubArrayRange {

    class Solution {
        public String maxSubArray(int[] nums) {
            int length = nums.length;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            int w1 = 0;
            int w2 = 0;

            for(int i = 0; i < length; i++){
                sum+=nums[i];
                if(max < sum){
                    max = sum;
                    w2 = i;
                }

                if(sum < 0){
                    sum = 0;
                    w1 = i + 1;
                }
            }
            return "Max Sub Array Range is from" + w1 + " to " + w2;
        }
    }
}
