import java.io.*;
import java.util.*;

class Repadd{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n,sum=0,s=0,k=0;
  n=sc.nextInt();
  while(n>0){
    sum=sum+(n%10);
    n=n/10;
  }
  s=sum;
if(sum<10){
  System.out.println(sum);
}
else{
  sum=0;
  while(s>0){
    sum=sum+(s%10);
    s=s/10;
  }
  System.out.println(sum);
}
}
}
