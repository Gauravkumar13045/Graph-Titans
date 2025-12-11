package dsa_project_gaurav;

public class Ques4 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 3, 3, 5, 5, 5, 9, 9, 9, 9, 10, 10, 10, 10, 10 };

        int k = removeDuplicates(nums);

        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nCount of unique elements = " + k);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

/*
This code has a function in which the first number will points the last unique element and the loop in it will find whether the number taken has any similar number in the array or not 
if it contain then it will be renamed coz in the nothing can be deleted but can be reassigned it's value and last the function has been return.
Now, this function will be called in the main function which also contains a k times of unique element.
At the last the print function which will print my actual removed duplicate from sorted array will be printed.

HAPPY CODING !!!...
*/
