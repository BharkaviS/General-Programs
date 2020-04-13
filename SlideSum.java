// Prints the contiguous array elements with maximum sum



import java.io.*;
import java.util.*;

public class SlideSum{

  public int maxSum(int start ,int end,int[] arr,int m){
    int i,sum=0;
    for(i=start;i<end;i++){
      sum+=arr[i];
    }
      return sum;
  }
  public static void main(String args[]){
    int n,i,sum,k,index,m=0,res,ms=0,me=0;
    Scanner sc = new Scanner(System.in);
    SlideSum sm = new SlideSum();
    int[] a = new int[1001];
    n=sc.nextInt();
    k=sc.nextInt();
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int start=0,end=k;
    for (index=0;index<(n-(k-1));index++) {
      sum=sm.maxSum(start,end,a,m);
      if(sum>m){
        m=sum;
        ms=start;
        me=end;
      }
      start+=1;
      end+=1;
    }
    for(i=ms;i<me;i++){
    System.out.print(a[i]+" ");
  }
}
}
s 
