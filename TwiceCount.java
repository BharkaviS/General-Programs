import java.io.*;
import java.util.*;

class TwiceCount{
  public static void main(String args[]){
    String a;
    int[] count= new int[256];
    int i,first=0,second=0,n;
    Scanner sc = new Scanner(System.in);
    a=sc.nextLine();
    n=a.length();
    for(i=0;i<n;i++){
      count[a.charAt(i)]++;
    }
    for(i=0;i<256;i++){
      if(count[i]>count[first]){
        second= first;
        first=i;
      }
      else if(count[i]>count[second] && count[i]!=count[first]){
        second=i;
      }
    }
    System.out.println("The second most frequent character is: "+(char)second);
  }
}
