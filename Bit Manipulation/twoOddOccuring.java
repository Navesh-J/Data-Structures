import java.util.Scanner;

/**
 * twoOddOccuring
 * 
 * Given an unsorted array, Arr[] of size N and that contains even number of
 * occurrences for all numbers except two numbers. Find the two numbers in
 * decreasing order which has odd occurrences.
 * 
 * Example 1:
 * 
 * Input:
 * N = 8
 * Arr = {4, 2, 4, 5, 2, 3, 3, 1}
 * Output: {5, 1}
 * Explanation: 5 and 1 have odd occurrences.
 */
public class twoOddOccuring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter an array :");
        int nums[]=new int [n];
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        int result[]=twoOddNum(nums,n);
        System.out.println(result[0]+" "+result[1]);
        sc.close();
    }

    public static int[] twoOddNum(int arr[], int n) {
        int XOR = 0, res1 = 0, res2 = 0;
        for (int i = 0; i < n; i++)
            XOR ^= arr[i];
        int s = XOR & ~(XOR - 1);
        for (int i = 0; i < n; i++) {
            if ((arr[i] & s) != 0)
                res1 ^= arr[i];
            else
                res2 ^= arr[i];
        }
        return new int[] { Math.max(res1, res2), Math.min(res1, res2) };
    }
}