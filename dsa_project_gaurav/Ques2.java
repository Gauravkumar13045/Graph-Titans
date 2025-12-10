// Given an array of integers nums, calculate the pivot index of this array.
package dsa_project_gaurav;

public class Ques2 {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };
        int total = 0;
        int leftSum = 0;


        for (int num : arr) {
            total += num;
        }


        for (int i = 0; i < arr.length; i++) {
            int rightSum = total - leftSum - arr[i];
            if (leftSum == rightSum) {
                System.out.println("Pivot index = " + i);
                return; 
            }
            leftSum += arr[i];
        }


        System.out.println("No pivot index found");
    }
}

/*
This question has simple 3 parts only at first we have to let the total, leftsum, and the array ;
Then, in the 2nd part we have to run a loop to find the total.
At the last we hv to run a loop which includes a if condition checking whether the leftsum is equal to the rightsum and if it is true;
we hv to print the Pivot index and if not then No pivot index found.
Happy Coding !!!! ..... 
*/



