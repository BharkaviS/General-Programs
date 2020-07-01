/*
A farm is represented as a R*C 2D matrix.Due to soil conditions,some crops are very weak.
These crops are vulnerable to insects.The weak crops are represented by W and good crops are represented as G.
When a crop is infected, the weak crops adjacent to it(in all directions north,south,east,west) are also infected
and destroyed.The crops which are already infected as I in the input.

Input Format:
First line contains R and C separated by space
Next R lines contain the matrix representation of the farm.

Output format:
The first R lines contain the farm status with the destroyed crops represented by D and weak crops as W and good crops as G.

Sample Input:
3 3
W G W
W G G 
W I G

Output:
D G W
D G G 
D D G

Sample Input:
5 5
W W G W W 
I W G G G 
G W G G G 
I G I W W 
G G W G G

Output:
D D G W W
D D G G G
G D G G G
D G D D D
G G D G G

*/

import java.io.*;
import java.util.*;

class Crop{
  public static void check(int i,int j,char[][] a,int r,int c){
    int k=0;
    if((i == r-1 || i==0) &&(j!=0 && j!=c-1)){
      if(a[i][j-1]== 'W'){
        a[i][j-1] = 'D';
       check(i,j-1,a,r,c);
      }
      if(a[i][j+1]== 'W'){
        a[i][j+1] = 'D';
       check(i,j+1,a,r,c);
      }
      k=i==0?i+1:i-1;
      if(a[k][j]== 'W'){
          a[k][j] = 'D';
           check(k,j,a,r,c);
        }
        return ;
      }
      if((j == c-1 || j==0) &&(i!=0 && i!=r-1)){
        if(a[i-1][j]== 'W'){
          a[i-1][j] = 'D';
         check(i-1,j,a,r,c);
        }
        if(a[i+1][j]== 'W'){
          a[i+1][j] = 'D';
         check(i+1,j,a,r,c);
        }
        k=j==0?j+1:j-1;
        if(a[i][k]== 'W'){
            a[i][k] = 'D';
             check(i,k,a,r,c);
          }
          return ;
        }
      if(i==r-1 && (j==0 || j==c-1)){
        if(a[i-1][j]=='W'){
          a[i-1][j] ='D';
           check(i-1,j,a,r,c);
        }
        k=j==0?j+1:j-1;
        if(a[i][k]=='W'){
          a[i][k] = 'D';
          check(i,k,a,r,c);
        }
        return ;
      }
      if(i==0 &&(j==0 || j==c-1)){
        if(a[i+1][j]=='W'){
          a[i+1][j] ='D';
         check(i+1,j,a,r,c);
        }
        k=j==0?j+1:j-1;
        if(a[i][k]=='W'){
          a[i][k] = 'D';
         check(i,k,a,r,c);
        }
        return ;
      }
     else{
        if(a[i][j-1]== 'W'){
          a[i][j-1] = 'D';
         check(i,j-1,a,r,c);
        }
        if(a[i][j+1]== 'W'){
          a[i][j+1] = 'D';
         check(i,j+1,a,r,c);
        }
        if(a[i-1][j]== 'W'){
          a[i-1][j] = 'D';
         check(i-1,j,a,r,c);
        }
        if(a[i+1][j]== 'W'){
          a[i+1][j] = 'D';
         check(i+1,j,a,r,c);
        }
        return ;
      }
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int r,c,i,j;
    r = sc.nextInt();
    c = sc.nextInt();
    char[][] a = new char[r][c];
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        a[i][j] = sc.next().charAt(0);
      }
    }
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        if(a[i][j]=='I'){
          a[i][j] = 'D';
          check(i,j,a,r,c);
        }
      }
    }
    for(i =0;i<r;i++){
      for(j=0;j<c;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}
