//SLIDING WINDOW
// arr= [1,8,30,-5,20,7]

import java.util.Scanner;

public class maximumSumKConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter K");
        int k=sc.nextInt();
        System.out.println("Maximum sum = "+ Ksum(arr,k));
        sc.close();
    }
    private static int Ksum(int arr[],int k){
        int curr_sum=0;
        for(int i=0;i<k;i++)
            curr_sum+=arr[i];
        int max_sum=curr_sum;
        for(int i=k;i<arr.length;i++){
            curr_sum+=(arr[i]-arr[i-k]);
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
}
