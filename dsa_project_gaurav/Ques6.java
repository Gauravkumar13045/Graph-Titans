/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 */

package dsa_project_gaurav;

import java.util.Arrays;

public class Ques6 {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp0 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp0;
                    high--;
                    break;

            }
        }
        System.out.println("Sorted Array (Red-White-Blue): " + Arrays.toString(arr));

    }
}
