import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        System.out.println("Enter K:");
        int k=sc.nextInt();
        System.out.println(josephus(n,k));
        sc.close();
    }
    public static int josephus(int n, int k)
    {
        return jos(n,k)+1;
    }
    private static int jos(int n,int k){
        if(n==1){
            return 0;
        }
        else{
            return (jos(n-1,k)+k)%n;
        }
    }
}
