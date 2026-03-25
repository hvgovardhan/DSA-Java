//LeetCode - 1480.

// Running Sum of 1d Array.
//Difficulty - Easy.
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]


import java.util.*;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i] + sum;
            sum = arr[i];
        }
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
