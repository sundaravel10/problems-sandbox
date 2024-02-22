package com.sandbox;

public class MaxSubArray {

    class Solution {
        public int maxSubArray(int[] nums) {
            int length = nums.length;
            int max = Integer.MIN_VALUE;
            int sum = 0;

            for(int i = 0; i < length; i++){
                sum+=nums[i];
                max = Math.max(max,sum);

                if(sum < 0){
                    sum = 0;
                }
            }

            return max;
        }
    }
}
