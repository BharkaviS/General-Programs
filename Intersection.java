import java.io.*;
import java.util.*;

public class Main
{
    static String inter(String str1,String str2){
        int i,n1,n2;
        int[] count = new int[256];
        String a ="";
        n1=str1.length();
        n2=str2.length();
        for(i=0;i<n2;i++){
            count[str2.charAt(i)]++;
        }
        for(i=0;i<n1;i++){
            if(count[str1.charAt(i)]>0){
                a=a+str1.charAt(i);
                count[str1.charAt(i)]--;
            }
        }
        return a;
    }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String a,b;
a=sc.nextLine();
b=sc.nextLine();
System.out.println(inter(a,b));
}
}
