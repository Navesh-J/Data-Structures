//leaders in an array
//leader elements are those which are greater of all those elements right to them.
// ip - [7,10,4,10,6,5,2]
//op - 10 6 5 2  -- output will be reversed (Accessing elements from right)

import java.util.*;
public class leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
        nums[i] = sc.nextInt();
        leaders(nums,n);
        sc.close();
    }
    private static void leaders(int nums[],int n){
        int current_leader=nums[n-1];
        System.out.print(current_leader+" ");
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]>current_leader){
                current_leader=nums[i];
                System.out.print(current_leader+" ");
            }
        }
    }
}