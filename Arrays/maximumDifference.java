// Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

// Return the maximum difference. If no such i and j exists, return -1.

 

// Example 1:

// Input: nums = [7,1,5,4]
// Output: 4
// Explanation:
// The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
// Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
// Example 2:

// Input: nums = [9,4,3,2]
// Output: -1
// Explanation:
// There is no i and j such that i < j and nums[i] < nums[j]

import java.util.Scanner;

public class maximumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
        nums[i] = sc.nextInt();
        System.out.println("Maximum Difference = "+ maximumDiff(nums));
        sc.close();
    }
    public static int maximumDiff(int[] arr) {
        int n=arr.length,min=arr[0],res=-1;
        for(int j=1;j<n;j++){
            if(arr[j]>min)
            res=Math.max(res,arr[j]-min);
            min=Math.min(min,arr[j]);
        }
        return res;
    }
}
