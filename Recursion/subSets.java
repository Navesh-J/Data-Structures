import java.util.Scanner;

public class subSets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.next();
        subSets obj=new subSets();
        obj.subsets(s);
        sc.close();
    }
    public void subsets(String s){
        subsets(s,"",0);
    }
    private void subsets(String s,String curr,int i){
        if (i==s.length()) {
            System.out.print(curr+" ");
            return;
        }
        subsets(s, curr, i+1);
        subsets(s, curr+s.charAt(i), i+1);
    }
}
