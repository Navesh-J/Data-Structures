import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        System.out.println(fun(n));
        sc.close();
    }
    public static int fun(int n){
        if(n<=9)
        return n;
        else
        return n%10+fun(n/10);
    }
}
