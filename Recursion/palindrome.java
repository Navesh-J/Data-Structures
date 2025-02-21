import java.util.*;;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        System.out.println(fun(s,0,s.length()-1));
        sc.close();
    }
    public static boolean fun(String s,int start,int end){
        if(start>=end)
        return true;
        return ((s.charAt(start)==s.charAt(end)) && (fun(s, start+1, end-1)));
    }
}
