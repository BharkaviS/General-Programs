import java.io.*;
import java.util.*;
/*Percentage Patten:
n=5:

  %----%
  ---%-
  --%--
  -%---
  %---%

n=7:

  %------%
  -----%-
  ----%--
  ---%---
  --%----
  -%-----
  %------%

  */
class PercentPat{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n,i,j,k;
  n=sc.nextInt();
  k=n-1;
  for(i=0;i<n;i++){
    for(j=0;j<n;j++){
      if((i==0 && j==0) ||(i==n-1 && j==n-1)){
        System.out.print("%");
      }
      else if(j==k){
        System.out.print("%");
        k--;
      }
      else{
        System.out.print("-");
      }
    }
      System.out.println(" ");
  }

}
}
