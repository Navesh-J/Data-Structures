import java.util.Scanner;

public class nToOne {
    
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
        System.out.println(n);
        fun(n-1);
    }
}
