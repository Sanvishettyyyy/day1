public class recursion3 {
    public static int calFactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact=calFactorial(n-1);
        int fact1=n*fact;
        return fact1;
        }
        public static void main(String[]args){
int n=5;
int ans=calFactorial(n);
System.out.println(ans);

        }
    }
// This code calculates the factorial of a number using recursion.
// The base case is when n is 0 or 1, returning 1.
