public class recursion5 {   //stack height = n;
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int result=calcPower(x,n-1);
        int result2=x*result;
        return result2;
    }
    public static void main(String[]args){
        int x=2;
        int n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }

        }
        
    

