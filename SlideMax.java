/*
Input:
3   //n value
2   //k value
100 200 300  //array values

*/






import java.io.*;
import java.util.*;

public class SlideMax{

  public int maxEle(int start ,int end,int[] arr){
    int max=0,i;
    for(i=start;i<end;i++){
      if(max<arr[i]){
        max=arr[i];
      }
    }
    return max;
  }
  public static void main(String args[]){
    int n,i,j,k,index,m;
    Scanner sc = new Scanner(System.in);
    SlideMax sm = new SlideMax();
    int[] a = new int[1001];
    n=sc.nextInt();
    k=sc.nextInt();
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int start=0,end=k;
    for (index=0;index<(n-(k-1));index++) {
      m=sm.maxEle(start,end,a);
      System.out.print(m+" ");
      start+=1;
      end+=1;
    }
  }
}
