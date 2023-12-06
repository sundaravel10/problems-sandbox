package com.sandbox;

import java.util.Arrays;

public class FairCandySwap {

    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int aliceTotal = 0;
            int bobTotal = 0;
            int m = aliceSizes.length;
            int n = bobSizes.length;
            for(int i = 0; i < m; i++){
                aliceTotal+= aliceSizes[i];
            }
            for(int i = 0; i < n; i++){
                bobTotal+= bobSizes[i];
            }
            Arrays.sort(bobSizes);

            for(int i = 0; i < m; i++){
                int target = (bobTotal - aliceTotal + 2 * aliceSizes[i])/2;
                if(binarySearch(bobSizes,target))
                    return new int[] {aliceSizes[i],target};
            }

            return new int[0];
        }

        private boolean binarySearch(int[] arr, int target){
            int l = 0;
            int r = arr.length - 1;


            while (l <= r){
                int m = l + (r-l)/2;
                if(target < arr[m]){
                    r = m - 1;
                }else if(target > arr[m]){
                    l = m + 1;
                }else{
                    return true;
                }
            }

            return false;
        }
    }
}
