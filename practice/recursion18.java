public class recursion18 {
    public static int placeTiles(int n,int m){
       if(n==m){
return 2;
       }
        if(n<m){
            return 1;
        }
        int printvertically=placeTiles(n-m,m);
        int printhorizontally=placeTiles(n-1,m);
        return printvertically+printhorizontally;
    }
    public static void main(String[]args){
        int n=4,m=2;
        System.out.println(placeTiles(n,m));
    }
}
