import java.io.*;
import java.util.*;

class Matcount{
  public static void main(String args[]){
    int n,i,j,k,ec=0,max=0,oc=0,c;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[][] a = new int[101][101];
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        a[i][j] = sc.nextInt();
      }
    }
    for(i=0;i<n;i++){
      oc=0;
      ec=0;
      for(j=0;j<n;j++){
        if(a[i][j]%2==0){
        if(a[i][j+1]%2==0){
            ec++;
          }
          else{
            break;
          }
        }
        if(a[i][j]%2==1){
        if(a[i][j+1]%2==1){
              oc++;
            }
            else{
              break;
            }
        }
      }
        if(oc>ec){
          c=oc;
        }
        else{
          c=ec;
        }
          if(c>max){
            max=c;
          }
        }

    System.out.println(oc+" "+ec+" "+max);
  }
}
