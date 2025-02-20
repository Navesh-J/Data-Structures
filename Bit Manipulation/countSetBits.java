//Count total number of bits that are set.

import java.util.Scanner;

public class countSetBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
