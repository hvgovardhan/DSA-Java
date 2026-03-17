//LeetCode Que - 33 
//Search in Rotated Sorted Array


import java.util.*;

public class rotated {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            // left half sorted
            if (nums[left] <= nums[mid]) {

                if (target >= nums[left] && target < nums[mid]) {     
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } 
            // right half sorted
            else {

                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(search(nums, target));
    }
}
