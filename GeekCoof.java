import java.io.*;
import java.util.*;

class GeekCoof{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n,x,i;
  n=sc.nextInt();
  x=sc.nextInt();
  x=x-1;
  while(x!=0){
    n=n/2;
    x--;
  }
  System.out.println(n);

}
}
