//return the index of .....

import java.util.*;
public class secondLargets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int index=getSecondLargest(nums);
        System.out.println("Index = "+index);
        if(index!=-1)
        System.out.println("Index = "+nums[index]);
        sc.close();
    }

    public static int getSecondLargest(int arr[]){
        int largest=0,res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[largest]<arr[i]){
                res=largest;
                largest=i;
            }
            else if(arr[i]<arr[largest]){
                if(res==-1||arr[i]>arr[res] )
                res=i;
            }
        }
        return res;
    }
}
