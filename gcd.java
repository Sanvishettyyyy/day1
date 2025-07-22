import java.util.*;
public class gcd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1=n1-n2;
            }else{
                n2=n2-n1;
            }
            }
            System.out.println("GCD is:"+n2);
sc.close();
        }
    }

//finding GCD of two numbers using subtraction method of the Euclidean algorithm.
// Keep subtracting the smaller number from the larger one until both numbers become equal.
// The number at that point (when n1 == n2) is the GCD.