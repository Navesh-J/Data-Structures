import java.util.*;

public class setbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and position :");
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(checkKthBit(n, k));
        sc.close();
    }
    static boolean checkKthBit(int n, int k) {
        if(((n>>(k-1))&1)==1)
        return true;
        else
        return false;
    }
}

//Check K-th bit is set or not.
//e.g - n=5 , k=3
// n=0101 , k=3
// 3rd bit from left is set.