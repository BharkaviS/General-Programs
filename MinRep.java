import java.io.*;
import java.util.*;

class MinRep{

  public static void main(String args[]){
    int c=0;
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    while(n!=1){
      if(n%2==0){
        n=n/2;
        c++;
      }
      else{
        if(n%10==7 || n%10==1){
          n=n+1;
        }
        else{
          n=n-1;
        }
        c++;
      }
    }
    System.out.println(c);
  }
}
