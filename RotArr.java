import java.io.*;
import java.util.*;

class Repadd{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n,i,j=0,x;
  int[] a= new int[101];
  int[] b= new int[101];
  n=sc.nextInt();
  for(i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  x=sc.nextInt();
  for(i=x;i<n;i++){
    b[j++]=a[i];
  }
  for(i=0;i<x;i++){
    b[j++]=a[i];
  }
  for(i=0;i<n;i++){
  System.out.print(b[i]+" ");
}

}
}
