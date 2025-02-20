// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]

import java.util.*;
public class rightRotateByD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
        nums[i] = sc.nextInt();
        System.out.println("Enter time of rotation");
        int k = sc.nextInt();
        rotate(nums,k);
        for (int i = 0; i < n; i++)
        System.out.print(nums[i]+" ");
        sc.close();
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        //left rotating the array by n-k times
        k=n-k;
        if(k==0) return;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
    private static void reverse(int[] nums,int low,int high){
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}
