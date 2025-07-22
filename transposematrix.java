import java.util.*;
public class transposematrix{
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();

int matrix[][]=new int[n][m];
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
       matrix[i][j]=sc.nextInt();
    }
}

for(int j=0;j<m;j++){                  // Transpose logic
    for(int i=0;i<n;i++){
         System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
}

sc.close();

    }
}
