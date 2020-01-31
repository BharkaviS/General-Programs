//Program to print only the characters that appear odd number of times in a string
//If no such characters exist,then print -1
import java.io.*;
import java.util.*;

class Oddlet{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s;
    int c=0;
    s=sc.nextLine();
    int[] a = new int[256];
    for(int i =0;i<s.length();i++){
      a[s.charAt(i)]++;
    }
    for(int i=0;i<s.length();i++){
      if((a[s.charAt(i)])%2==1){
        System.out.print(s.charAt(i));
        a[s.charAt(i)]=0;
        c=1;
      }
    }
    if(c==0){
      System.out.println("-1");
    }  }
}
