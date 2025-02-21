// Find the maximum number of pieces a rod can be cut
// Given a rope of length n, you need to find the maximum number of pieces
// you can make such that the length of every piece is in set {a, b, c} for
// the given three values a, b, c
import java.util.Scanner;
public class ropeCutting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n,a,b and c");
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(fun(n,a,b,c));
        sc.close();
    }

    private static int fun(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int res=Math.max(fun(n-a, a, b, c), Math.max(fun(n-b, a, b, c),fun(n-c, a, b, c)));
        if(res==-1) return -1;
        return res+1;
    }
}
