import java.util.*;
public class recursion20 {
    public static void printSubsets(ArrayList<Integer> subsets){
        for(int i=0;i<subsets.size();i++){
            System.out.println(subsets.get(i)+" ");
        }
    }
    public static void findSubsets(int n,ArrayList<Integer> subsets){
        if(n==0){
            System.out.println(subsets);
            return;
        }
        subsets.add(n);
        findSubsets(n-1,subsets);
subsets.remove(subsets.size()-1);
findSubsets(n-1,subsets);

    }
    public static void main(String[]args){
        int n=3;
        ArrayList<Integer> subsets=new ArrayList<>();
        findSubsets(n,subsets);
    }
}
