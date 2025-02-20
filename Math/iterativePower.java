import java.util.*;
public class iterativePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and power :");
        long x=sc.nextLong();
        long n=sc.nextLong();
        System.out.println(power(x,n));
        sc.close();
    }
    public static long power(long  x,long  n){
        long res=1;
        while(n>0){
            if(n%2!=0){
                res*=x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
}
