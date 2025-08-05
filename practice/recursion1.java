public class recursion1 {
    public static void printNo(int n){
//     if(n==0){       //print from n to 1;
//         return;}
//         System.out.println(n);
//         printNo(n-1);
//     }
//     public static void main(String[]args){
//         int n=5;
//         printNo(n);
//     }
// }
if(n==6){       //print 1 to n
    return;
}
System.out.println(n);
printNo(n+1);
}
public static void main(String[]args){
        int n=1;
         printNo(n);
}
}