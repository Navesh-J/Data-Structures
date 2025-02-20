// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
// Example 2:

// Input: nums = [0,1]
// Output: 2
// Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter an array :");
        int nums[]=new int [n];
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        System.out.println("Missing Number = "+missingNum(nums));
        sc.close();
    }
    public static int missingNum(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n+1;i++){
            res^=i;
        }
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}
