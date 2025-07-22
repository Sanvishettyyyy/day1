import java.util.*;
public class program2 {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x value");
        int x=sc.nextInt();
        System.out.println("enter n value");
        int n=sc.nextInt();
       int result=1;
       for(int i=1;i<=n;i++){
        result=result*x;
       }
       System.out.println(result);
       sc.close();
       }
        }
    

