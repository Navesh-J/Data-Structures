
// ip- [1,0,0,0,1,0,0,1,1,1,1]
// op- From 1 to 3
//     From 5 to 6
import java.util.Scanner;

public class consecutiveFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        printGroups(arr);
        sc.close();
    }
    private static void printGroups(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i]){
                if(arr[i]!=arr[0])
                    System.out.print("From "+i+" to ");
                else
                    System.out.println(i-1);
            }
        }
        if(arr[n-1]!=arr[0]){
            System.out.println(n-1);
        }
    }
}
