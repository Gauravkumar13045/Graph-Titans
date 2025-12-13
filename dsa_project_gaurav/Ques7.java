// Given an unsorted array arr[ ] having both negative and positive integers. The task is to place all negative elements at the end of the array without changing the order of positive elements and negative elements.

package dsa_project_gaurav;

import java.util.Arrays;

public class Ques7 {
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, -5, 6 };
        int n = arr.length;
        int result[] = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index++] = arr[i];
            }

        }

        for (int u = 0; u < n; u++) {
            if (arr[u] < 0) {
                result[index++] = arr[u];
            }

        }
        System.out.println("Stable Partitioned Array: " + Arrays.toString(result));

    }
}

/*
 * This is the simple code we just have to do is to sort to positive and
 * negative nothing else
 * so i have added two loop one will copy only positive and another negative and
 * at last we will copy the all of it and hence solved !!!...
 * 
 * HAPPY CODING !!!...
 */
