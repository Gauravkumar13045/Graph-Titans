/*
Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
Note:- The position you return should be according to 1-based indexing. 
*/

package dsa_project_gaurav;

import java.util.*;

public class Ques10 {

    public int firstRepeating(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (freq.get(arr[i]) > 1) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Ques10 obj = new Ques10();

        int[] arr1 = { 1, 5, 3, 4, 3, 5, 6 };

        System.out.println("First repeating in arr: " + obj.firstRepeating(arr1));

    }
}

// As i hv studied i know till know that this is the easy and effective method to solve this question using a approach called frequency map.
// By every time counting frequency then finding first element with the freq greater than 1 and at last returning the element then print it...And all set !!...

// HAPPY CODING !!!...

