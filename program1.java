import java.util.*;
public class program1 {
    public static void main(String[]args){
        int positive=0;
        int negative=0;
        int zeros=0;
        System.out.println("enter 1 to continue or 0 to stop:");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
while(input==1){
    System.out.println("enter a number");
    int number=sc.nextInt();

    if(number>0){
        positive++;
    }else if(number<0){
        negative++;
    }else if(number==0)
    {zeros++;
    }
    System.out.println("enter 1 to continue or 0 to stop:");
    input=sc.nextInt();
    }
    System.out.println("positive:"+positive);
    System.out.println("negative:"+negative);
    System.out.println("zeros:"+zeros);
    sc.close();
    }

}
    