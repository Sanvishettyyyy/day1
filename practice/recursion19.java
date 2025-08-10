public class recursion19 {
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
      int singleguest= callGuest(n-1);
int pairguest=(n-1)*callGuest(n-2);
return singleguest+pairguest;
    }
    public static void main(String[]args){
        int n=4;
        System.out.println(callGuest(n));
    }
}
