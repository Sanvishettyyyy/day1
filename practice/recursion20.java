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
        subsets.add(n);    //add from last index that is n
        findSubsets(n-1,subsets);   //continue it for n-1 elements
subsets.remove(subsets.size()-1);   //remove it till size-1
findSubsets(n-1,subsets);           

    }
    public static void main(String[]args){
        int n=3;
        ArrayList<Integer> subsets=new ArrayList<>();  //subsets in array list format
        findSubsets(n,subsets);
    }
}
