public class recursion6 {        // Calculate power of a number using recursion
    // The base case is when n is 0, returning 1.
    // If x is 0, return 0.
    // If n is even, calculate power by halving n and squaring the result.
    // If n is odd, calculate power by halving n, squaring the result, and multiplying by x.
    //stack height=log(n)
     public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcPower(x,n/2)*calcPower(x,n/2);
        }
        else{
            return calcPower(x,n/2)*calcPower(x,n/2)*x;
        }
        
    }
    public static void main(String[]args){
        int x=2;
        int n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }

        }
        

