import java.io.*;
import java.util.*;

class RepStr{

  public static void main(String args[]){
    int x,i,n;
    String str;
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    x = sc.nextInt();
    n=str.length();
    for(i=0;i<n;i++){
      if(i!=x-1){
        System.out.print(str.charAt(i));
      }

      else{
        while(x>0){
          System.out.print(str.charAt(i));
          x--;
        }
      }
    }
  }
}
