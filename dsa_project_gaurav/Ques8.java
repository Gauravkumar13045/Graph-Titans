package dsa_project_gaurav;

public class Ques8 {


    public int findDuplicate(int[] nums) {
       
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);


        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }


    public static void main(String[] args) {
        Ques8 obj = new Ques8();
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};
        int[] nums3 = {3, 3, 3, 3, 3};

        System.out.println("Duplicate in nums1: " + obj.findDuplicate(nums1)); 
        System.out.println("Duplicate in nums2: " + obj.findDuplicate(nums2)); 
        System.out.println("Duplicate in nums3: " + obj.findDuplicate(nums3)); 
    }
}
/*
This code treats the array like a path where each number points to the next index, similar to a linked list.
Because one number repeats, a cycle is formed. First, two pointers (slow and fast) move through the array at different speeds until they meet inside the cycle.
Then, one pointer is reset to the start, and both move step by step until they meet again. The meeting point is the duplicate number.
 In simple terms, the code cleverly detects the repeated value without extra memory or changing the array.

 HAPPY CODING !!!...
*/