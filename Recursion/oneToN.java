import java.util.Scanner;

/**
 * oneToN
 */
public class oneToN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int n=sc.nextInt();
        fun(n);
        sc.close();
    }
    public static void fun(int n){
        if(n==0)
        return;
        fun(n-1);
        System.out.println(n);
    }
}