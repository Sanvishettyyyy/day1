
        import java.util.*;
public class function9{
    public static void radiusOfCircle(int r){
         double cir=(2*3.14*r);
    System.out.println("circumference of the circle is"+cir);
    return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
          radiusOfCircle(r) ;
            sc.close();
         }
}

