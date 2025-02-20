//Appication of MOORE'S VOTING ALGORITHM


// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int res=findMajority(arr);
        System.out.println("Majority Element = "+arr[res]);
        sc.close();
    }
    private static int findMajority(int arr[]){
        int n=arr.length;
        int res=0,count=1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]) count++;
        }
        if(count<=(n/2)) res=-1;
        return res;
    }
}