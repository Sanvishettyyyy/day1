import java.util.*;
public class array7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];
        
        //input 2D array
        for(int i=0;i<rows;i++)
        { for(int j=0;j<cols;j++){
            numbers[i][j]=sc.nextInt();
        }}

        int x=sc.nextInt();

        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){         //traversing the 2D array
                    
System.out.println("x is found in location ("+i+","+j+")");

                }
}
        }
  sc.close();  }
}

