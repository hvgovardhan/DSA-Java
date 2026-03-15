//Find First and Last Position of Element in Sorted Array.
//LeetCode Question - 34.

import java.util.Arrays;
import java.util.Scanner;

public class BS {

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;
            } 
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return result;
    }

    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;
            } 
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        int[] result = searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
