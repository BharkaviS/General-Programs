/*
Reverse a string without affecting special characters
Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

Examples:

Input:   str = "a,b$c"
Output:  str = "c,b$a"

Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

*/

import java.io.*;
import java.util.*;

class RevString{
  public static void main(String args[]){
    Stack<Character> stack = new Stack<Character>();
    String str = new String();
    Scanner sc = new Scanner(System.in);
    int i,j;
    String res = "";
    str = sc.nextLine();
    int n = str.length();
    for(i=0;i<n;i++){
      if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
        stack.push(str.charAt(i));
      }
    }
    for(i=0;i<n;i++){
      if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
        char x = stack.pop();
        res+=x;
      }
      else{
        res+=str.charAt(i);
      }
    }
    System.out.println(res);
  }
}
