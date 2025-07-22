
import java.util.Scanner;

public class stringss {
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
       // String name=sc.next();      //only first string will be printed
       String name=sc.nextLine();       // to read the entire line including spaces
        System.out.println("name is:"+name);
        sc.close();
    }
}
