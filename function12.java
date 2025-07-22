import java.util.*;
public class function12 {
    public static void fibonacciSeries(int n){
        int a=0;int b=1;
        System.out.print(a+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
            System.out.print(b+" ");
            int temp=b;
            b=a+b;
            a=temp;
        }
       
    }
    return;
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacciSeries(n);
        sc.close();
    }
}
