     import java.util.*;
public class function10{
    public static void ageToVote(int age){
        if(age>18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
        return;
        }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
          ageToVote( age) ; 
        sc.close();}
}


    

