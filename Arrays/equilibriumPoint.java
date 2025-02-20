// Given an array arr of non-negative numbers. The task is to find the first equilibrium point in an array. The equilibrium point in an array is an index (or position) such that the sum of all elements before that index is the same as the sum of elements after it.

// Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

// Examples:

// Input: arr[] = [1, 3, 5, 2, 2]
// Output: 3 
// Explanation: The equilibrium point is at position 3 as the sum of elements before it (1+3) = sum of elements after it (2+2). 
// Input: arr[] = [0, 1, 0]
// Output: 2
// Explanation: Since sum all the elements before 1 and after 1 are same, so index 2 is equillibrium.

import java.util.Scanner;

public class equilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Equilibrium at: "+equilibrium(arr));
        sc.close();
    }
    public static int equilibrium(int arr[]) {
        int sum=0;
        for(int a:arr) sum+=a;
        int lsum=0;
        for(int i=0;i<arr.length;i++){
            if(lsum==sum-arr[i]){
                return i+1;
            }
            lsum+=arr[i];
            sum-=arr[i];
        }
        return -1;
    }
}
