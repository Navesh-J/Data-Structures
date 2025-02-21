//count distinct elements
import java.util.*;
public class distinctElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.println("Distinct Elements : "+set.size());
        sc.close();
    }
}