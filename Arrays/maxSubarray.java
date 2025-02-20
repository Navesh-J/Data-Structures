// Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

// Note: A subarray is a contiguous part of any given array.

// Examples:

// Input: arr[] = [100, 200, 300, 400] , k = 2
// Output: 700
// Explanation: arr3  + arr4 = 700, which is maximum.
// Input: arr[] = [100, 200, 300, 400] , k = 4
// Output: 1000
// Explanation: arr1 + arr2 + arr3 + arr4 = 1000, which is maximum.

import java.util.Scanner;

public class maxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter size of k");
        int k=sc.nextInt();
        System.out.println("Max Subarray: "+maxSub(arr,k));
        sc.close();
    }
    private static int maxSub(int arr[],int k){
        int window=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            window+=arr[i];
        }
        int max=window;
        for(int i=0;i<n-k;i++){
            window+=(arr[i+k]-arr[i]);
            max=Math.max(max,window);
        }
        return max;
    }
}
