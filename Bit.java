/*
Input:
10
3
1 1 1 1 1 1 1 1 1 1

Output:
1 1 1 0 1 1 1 0 1 1 1 0 1

Input:
12
3
1 0 1 1 0 1 1 0 1 1 1 1 

Output:
1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0

*/

import java.io.*;
import java.util.*;

public class Bit{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,k,i,j,l=0,c=0,s;
    int[] arr = new int[1001];
    int[] ar = new int[1001];
    n=sc.nextInt();
    k=sc.nextInt();
    for(i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
      c=0;
      s=i;
      if(arr[i]==1){
        ar[l++]=arr[i];
        for(j=i+1;j<s+k;j++){
          if(arr[j]!=1)
            break;
          else{
            ar[l++]=arr[j];
            i++;
            c++;
          }
        }
        if(c==k-1)
          ar[l++]=0;
      }
      else
        ar[l++]=arr[i];
    }
    for(i=0;i<l;i++)
      System.out.print(ar[i]+" ");
  }
}
