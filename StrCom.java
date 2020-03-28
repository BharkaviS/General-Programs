/*

String Compression
Input : "aabbbcc"

Output:a2b3c2

*/




import java.io.*;
import java.util.*;

public class StrCom
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int i,c;
		int[] count = new int[256];
		s=sc.nextLine();
		char a[] = new char[1];
		for(i=0;i<s.length();i++){
		    count[s.charAt(i)]++;
		}
		for(i=0;i<s.length();i++){
		    if(count[s.charAt(i)]!=0 && a[0]!=s.charAt(i)){
		    c=(int)s.charAt(i);
		    System.out.print((char)c);
		    System.out.print(count[s.charAt(i)]);
		    a[0]=s.charAt(i);
		    }
		}
	}
}
