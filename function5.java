    import java.util.Scanner;

public class function5 {
  public static void primeOrNot(int n){
    if(n<=1){
        System.out.println("not prime");
        return;
    }
    for(int i=2; i<=Math.sqrt(n); i++)
    {
        if(n % i == 0){
            System.out.println("not prime");
            return;
        }
    
        
       
    }
    System.out.println("prime");
}
        
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         primeOrNot(n);
            sc.close(); 
    }
      

}
