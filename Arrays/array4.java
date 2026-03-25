//LeetCode - 1920.
//Build Array from Permutation.

import java.util.*;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        for (int i=0; i< arr.length; i++ ){
            ans[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}
