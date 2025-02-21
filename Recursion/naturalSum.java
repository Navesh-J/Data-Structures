import java.util.*;
public class naturalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int n=sc.nextInt();
        System.out.println("Sum of first n natural :"+fun(n));
        sc.close();
    }
    public static int fun(int n){
        if(n==0)
        return 0;
        return n+fun(n-1);
    }
}
