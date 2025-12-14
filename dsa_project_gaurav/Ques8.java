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
isme Floyd’s Tortoise and Hare (Cycle Detection) algorithm ka use kiya gaya hai too jisme two pointers ko inittialize kiya gaya hai and fast and slow dono cycle ko
taab tak move karo jaab tak wo meet naa kare then at last reset krna and duplicate ko return hai and all set !!!...

 HAPPY CODING !!!...
*/