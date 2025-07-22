import java.util.*;
public class array5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);   
    int size=sc.nextInt();
int numbers[]=new int[size];
for(int i=0;i<size;i++){            //input
    numbers[i]=sc.nextInt();
}
boolean isAscending = true;  
for(int i=0;i<numbers.length-1;i++){             //condition
    // Check if the current element is greater than the next element
    if(numbers[i] > numbers[i+1]){
        isAscending = false;
    }
 }
 if(isAscending){
    System.out.println("ascending order");
 } else{                                              //output
    System.out.println("not ascending order");
 }
sc.close();
 }
}
