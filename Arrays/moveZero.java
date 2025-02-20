// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

import java.util.Scanner;

public class moveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
        nums[i] = sc.nextInt();
        moveZeroes(nums);
        for (int i = 0; i < n; i++)
        System.out.print(nums[i]+" ");
        sc.close();

    }
    public static void moveZeroes(int[] nums) {
        int index=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0)
            nums[index++]=nums[i];
        }
        while(index<n)
        nums[index++]=0;
    }
}
