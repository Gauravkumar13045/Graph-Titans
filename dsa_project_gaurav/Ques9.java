package dsa_project_gaurav;

import java.util.*;

public class Ques9 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1]; 


        for (int num : nums) {
            seen[num] = true;
        }


        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ques9 obj = new Ques9();

        int[] nums1 = {4,3,2,7,8,2,3,1};

        System.out.println("Missing in nums1: " + obj.findDisappearedNumbers(nums1)); 

    }
}

// This is the best and i think a very effective method to tackle this question using the boolean array 
// By marking all the number which appears and bu collecting missing number and then at last as we all know print it to see...and all set !!...

// HAPPY CODING !!!....