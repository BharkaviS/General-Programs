/*

Input:
4
3 -5 8 1
Output:
3 8

Input:
12
1 2 5 7 19 20 12 11 9 15 45 45
Output:
1 2 5 7 19 20 45

*/

import java.io.*;
import java.util.*;

class GreaterArrEle {
  public static void main(String args[]){
    int n,i,j,c=0;
    int[] arr = new int[1001];
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    for(i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.print(arr[0]+" ");
    for(i=1;i<n;i++){
      for(j=0;j<i;j++){
        if(arr[i]<=arr[j]){
          c=0;
          break;
        }
        c=1;
      }
      if(c==1){
        System.out.print(arr[i]+" ");
      }
    }
  }
}
