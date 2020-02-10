import java.io.*;
import java.util.*;
import java.lang.*;
class Over{

  public static Boolean pres(String str, String pat){
      int n1,n2,c=0,i;
      n1=str.length();
      n2=pat.length();
      //System.out.println(n1+" "+n2);
      int[] c_str = new int[256];
      int[] p_str = new int[256];
      for(i=0;i<n1;i++){
        c_str[str.charAt(i)]++;
      }
      for(i=0;i<n2;i++){
        p_str[pat.charAt(i)]++;
      }
      for(i=0;i<256;i++){
        if(p_str[i]<=c_str[i] && (p_str[i]!=0 && c_str[i]!=0)){
          //System.out.print((char)i+" ");
          c+=p_str[i];
        }
      }
      //System.out.println(c);
      if(c==n2)
      return true;
      else
      return false;
  }
  public static void main(String args[]){
    Over u = new Over();
    int n,count=0,i;
    Scanner sc = new Scanner(System.in);

    String str,pat;

    str=sc.nextLine();
    n=sc.nextInt();
    String[] a = new String[n+1];
    for(i=0;i<=n;i++){
    a[i]=sc.nextLine();
    }
    for(i=0;i<=n;i++){
      if(pres(str,a[i])==true){
        count++;
      }
      else{
        System.out.println("No");
        System.exit(0);
      }
    }
    System.out.println("Yes");
}
}
