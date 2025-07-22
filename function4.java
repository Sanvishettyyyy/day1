import java.util.Scanner;

public class function4 {
  public static void evenOrOdd(int n){
       if(n%2==0){
        System.out.println("even");
       }else{
        System.out.println("odd");
        }
        
        return;
    }
        
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         evenOrOdd(n);
    sc.close();}
      
}
