//check if array is sorted
import java.util.*;
public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(isSortedd(nums));
        sc.close();
    }
    public static boolean isSortedd(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
            return false;
        }
        return true;
    }
}
