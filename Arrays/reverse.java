import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
        nums[i] = sc.nextInt();
        toReverse(nums);
        for (int i = 0; i < n; i++)
        System.out.print(nums[i] + " ");
        sc.close();
    }
    private static void toReverse(int nums[]){
        int l=0,r=nums.length-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}
