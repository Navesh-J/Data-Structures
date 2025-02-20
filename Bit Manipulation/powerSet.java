import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * powerSet
 * 
 * Given an integer array nums of unique elements, return all possible
 * subsets
 * (the power set).
 * 
 * The solution set must not contain duplicate subsets. Return the solution in
 * any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */
public class powerSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter an array :");
        int nums[]=new int [n];
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        System.out.println(subsets(nums));
        sc.close();
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> master=new ArrayList<>();
        int n=nums.length;
        int powSize=1<<n;
        for(int counter=0;counter<powSize;counter++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((counter & (1<<j)) !=0)
                list.add(nums[j]);
            }
            master.add(list);
        }
        return master;
    }
}