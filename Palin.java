import java.io.*;
import java.util.*;

class Palin{
  public static void main(String args[]){
    int n,i,k=0,j,c=0;
    String s;
    Scanner sc= new Scanner(System.in);
    s=sc.nextLine();
    n=s.length();
    for(i=1;i<n-1;i++){
      k=i;
      if(k!=0 || k!=n-1){
        if(s.charAt(k-1)==s.charAt(k+1)){
          c=1;
          for(j=k-1;j<=k+1;j++){
            System.out.print(s.charAt(j));
          }
          System.out.println(" ");
        }

      }
    }
    if(c==0){
      System.out.println("-1");
    }
  }
}
