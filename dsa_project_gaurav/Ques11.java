/*
Given three sorted arrays in non-decreasing order, print all common elements in non-decreasing order across these arrays. 
If there are no such elements return an empty array. In this case, the output will be -1.
*/

package dsa_project_gaurav;

public class Ques11 {

    public void printCommon(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        boolean found = false;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                found = true;

                int val = arr1[i];

                while (i < arr1.length && arr1[i] == val)
                    i++;
                while (j < arr2.length && arr2[j] == val)
                    j++;
                while (k < arr3.length && arr3[k] == val)
                    k++;
            }

            else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        if (!found) {
            System.out.print(-1);
        }
    }

    public static void main(String[] args) {
        Ques11 obj = new Ques11();

        int[] arr1 = { 1, 5, 10, 20, 40, 80 };
        int[] arr2 = { 6, 7, 20, 80, 100 };
        int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

        obj.printCommon(arr1, arr2, arr3);
    }
}

/*
Ye jo code hai mere hisab se easy and good hai ....
Yeh code 3 sorted arrays ko compare karta hai using three pointers.
Agar koi element teeno arrays mein same hai toh print hota hai.
Duplicates skip kiye jaate hain aur agar common na ho toh -1 print hota hai... And all set..

Happy coding !!!....

*/
