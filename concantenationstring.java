import java.util.Scanner;

public class concantenationstring {
   public static void main(String[]args){
         Scanner sc=new Scanner(System.in); 
        // String firstname="sanvi";
        // String lastname="shetty";
        // String fullname=firstname+" "+lastname;
        // System.out.println(fullname.length());    //to find the length of the string

  // for(int i=0;i<fullname.length();i++){
       // System.out.println(fullname.charAt(i));// to print each character in the string

           //String sentence="my name is sanvi";  
         String sentence="sanvishetty";  
          String name=sentence.substring(5,sentence.length()); // to extract a substring from the string
    System.out.println(name);
sc.close();
}
   }

