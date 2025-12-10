// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
package dsa_project_gaurav;

public class Ques3 {
  public static void main(String[] args) {
    int[] arr = { 6, 0, 4, 2, 3, 5 };
    int n = arr.length;

    for (int i = 0; i <= n; i++) {
      boolean isMissing = false;

      for (int u = 0; u < arr.length; u++) {
        if (i == arr[u]) {
          isMissing = true;
          break;

        }

      }
      if (!isMissing) {
        System.out.println("Missing number is: " + i);
        break;
      }

    }

  }
}

/*
This program is states that to find the number between some range that the number is missing or not if yes then what is it !!!
This program lies in three parts;
First part : first arr , n contains length of array;
Second part : 1st loop will iterate between the array andf contain a boolean of isMissing;
Third part : 2nd loop will compare and find whether it contain the missing number or not is yes then if condition will print that .....
*/