// Print the number that occurs odd number of times in an array.

import java.util.Scanner;

public class odd_occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter an array :");
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int res=0;
        for(int num:arr){
            res^=num;
        }
        System.out.println("Odd occuring = "+res);
        sc.close();
    }
}
