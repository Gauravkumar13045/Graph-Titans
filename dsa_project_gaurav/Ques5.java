/*You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
*/

package dsa_project_gaurav;

public class Ques5 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        double maxAvg = Double.NEGATIVE_INFINITY;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            double avg = (double) sum / k;

            if (avg > maxAvg) {
                maxAvg = avg;
            }

        }
        System.out.println(maxAvg);
    }
}

/*
It is the most simple question in which we have to just find the number which give maximum average.
*/