/*
Given a matrix of N * N. 
Find the maximum path sum in matrix. 
The maximum path is sum of all elements from first row to last row where you are allowed to move only down or 
diagonally to left or right. You can start from any element in first row.

Input : mat[][] = 10 10  2  0 20  4
                   1  0  0 30  2  5
                   0 10  4  0  2  0
                   1  0  2 20  0  4
Output : 74
The maximum sum path is 20-30-4-20.

Input : mat[][] = 1 2 3
                  9 8 7
                  4 5 6
Output : 17
The maximum sum path is 3-8-6.
*/

import java.io.*;
import java.util.*;

class MaxPathSumMat{
  public static int maxOfpath(int n,int[][] a,int i,int j,int sum){
    int k;
    if(i+1 > n-1){
      return sum;
    }

    if(j==0 || j==n-1 && (i!=n-1)){
      k = (j==0)?j+1:j-1;
      if(a[i+1][j]>a[i+1][k])
        sum+=a[i+1][j];
      else{
        sum+=a[i+1][k];
        j = k;
      }
    }
    else{
    if(a[i+1][j] > a[i+1][j-1] && a[i+1][j]>a[i+1][j+1])
      sum+=a[i+1][j];
    else if(a[i+1][j+1] > a[i+1][j-1]){
      sum += a[i+1][j+1];
      j = j+1;
    }
    else{
      sum+= a[i+1][j-1];
          j = j-1;
    }
  }
    return maxOfpath(n,a,i+1,j,sum);//return sum;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,i,j,k=0,max = 0,sum =0;
    n = sc.nextInt();
    int[][] a = new int[n][n];
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(j=0;j<n;j++){
      if(a[0][j]>max){
        max = a[0][j];
        k = j;
      }
    }
    sum += max;
    sum = maxOfpath(n,a,0,k,sum);
    System.out.print("Sum is : "+sum);
  }
}
