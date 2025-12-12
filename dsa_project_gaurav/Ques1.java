// Q1) Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

package dsa_project_gaurav;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = 0;
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {

            for (int u = i + 1; u < arr.length; u++) {
                if (arr[i] + arr[u] == target) {
                    isFound = true;
                    System.out.println("Pair found: " + arr[i] + " and " + arr[u] +
                            " at indices " + i + " and " + u);
                    break;
                }
            }
            if (isFound)
                break;

        }

        if (!isFound) {
            System.out.println("Not found");
        }
    }
}

/*
Hello guys, This code of mine is a code from GFG and it ask us to check that which two number from array can bring the target as a result by adding themselves
So, i hv made it using two nested loops which will brute force and find that two numbers if not found then print "not Found"
Happy Coding !!!....
*/
