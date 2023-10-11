package com.sandbox;

public class SortColors {

    class Solution {
        public void sortColors(int[] nums) {
            mergeSort(nums);
        }

        public void mergeSort(int[] nums){
            int len = nums.length;
            if(nums == null || len == 1){
                return;
            }

            int mid = len / 2;
            int rightLen = len - mid;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[rightLen];
            System.arraycopy(nums,0,leftArray,0,mid);
            System.arraycopy(nums,mid,rightArray,0,rightLen);

            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(leftArray,rightArray,nums);
        }

        public void merge(int[] leftArray,int[] rightArray,int[] nums){
            int l = 0;
            int r = 0;
            int k = 0;

            while(l < leftArray.length && r < rightArray.length){
                if(leftArray[l] < rightArray[r]){
                    nums[k++] = leftArray[l++];
                }else{
                    nums[k++] = rightArray[r++];
                }
            }

            while(l < leftArray.length){
                nums[k++] = leftArray[l++];
            }

            while(r < rightArray.length){
                nums[k++] = rightArray[r++];
            }
        }
    }
}
