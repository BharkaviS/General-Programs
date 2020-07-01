import java.io.*;
import java.util.*;

class Week8{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,j,r,c,k=0,l;
    int[][] a =new int[101][101];
    int[][] b= new int[101][101];
    r=sc.nextInt();
    c=sc.nextInt();
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        a[i][j]=sc.nextInt();
      }
    }
      for(j=0;j<c;j++){
        if((j+1)%2!=0){
          k=0;

            for (i=r-1;i>=0;i--){
              b[k++][j]=a[i][j];
            }
        }
        else{
          for(i=0;i<r;i++){
            b[i][j]=a[i][j];
          }
        }
      }
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          System.out.print(b[i][j]+" ");
        }
        System.out.println();
      }
  }
}
