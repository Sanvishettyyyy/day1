import java.util.*;
public class function11 {
public static int powerNo(int x,int n){
    int result=1;
    for(int i=0;i<n;i++){
        result=result*x;
    }
    return result;

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
       System.out.println(powerNo(x,n));
       sc.close();

    }
}