/// This program generates th fibbonacci numbers.



import java.io.*;
import java.util.*;
import java.lang.*;
class Fib{

  public int fib(int n){
    int[] F = new int[n+2];
    int i;
    F[0]=0;
    F[1]=1;
    for(i=2;i<=n;i++){
      F[i]=F[i-1]+F[i-2];
    }
      return F[n];
  }
  public static void main(String args[]){
    Fib u = new Fib();
    Scanner sc = new Scanner(System.in);
    int n,res;
    n=sc.nextInt();
    System.out.println(u.fib(n));
}
}
