
    import java.util.*;
public class function8 {
    public static void greaterNo(int a,int b){
         if(a>b)
         {
            System.out.println(a+" is greater than "+b);
         }else{
            System.out.println(b +" is greater than "+a);
         }
         return;
         }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
greaterNo(a,b);
        sc.close();
    }
}


