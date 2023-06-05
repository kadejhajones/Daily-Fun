//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
//To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
//nums2 has a length of n.

import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Og approach was to create a separate array & then copy over data but got time limit exceeded understandably
            //int [] answerArray = new int [m+n];
            // for(int g = 0; g < size; g++){
            //    //copying over the array 
            //     answerArray[g] = nums1[g];
            // }
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; 
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    // mergeMe(A, B) {
    //     dest;
    //     while(AhasMore && BhasMore) {
    //         if A-val < B-val {
    //             dest[nextPos++] = A-val; //Store it away in the dest and move on
    //             A-Index++;
    //         else
    //             same crap for B
    //         }
    //     }
    //     //Copy all that remains of A

    //     //Copy all that remains of B

    //     }
    // }
    // mergeMe(A,B) {
    //     dest;
    //     while(AHasMore || BHasMore) {
    //         if(bIsDone || (!aIsDone && A-val<B-val)) {
    //             copy A stuff into dest and move on
    //         } else {
    //             copy B stuff into dest and move on
    //         }
    //     }
    //     //They're both done, so no copying needed
    // }
}
