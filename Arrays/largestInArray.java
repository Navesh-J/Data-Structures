import java.util.Scanner;

/**
 * largestInArray
 */
public class largestInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int max = nums[0];
        for (int num : nums) {
            if (num > max)
                max = num;
        }
        System.out.println("Maximum Element = " + max);
        sc.close();
    }
}