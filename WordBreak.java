/*
A string S and N words are given as the input to the program. The program must print Yes if each word among the N
words can be formed using the alphabets in the string S. Else the program must print No as the output.
Boundary Condition(s):
1 <= Length of each string <= 1000
1 <= N <= 100
Input Format:
The first line contains string S.
The second line contains N.
The next N lines contain N string values one in each line.
Output Format:
The first line contains Yes or No based on the given conditions.
Example Input/Output 1:
Input:
telephonegrammary
3
telegram
memory
elegant
Output:
Yes
Example Input/Output 2:
Input:
amsterdamacademy
2
amy
racer
Output:
No
Explanation:
racer has two r which are not available in the strin
*/



import java.io.*;
import java.util.*;

class WordBreak{
  public boolean Check(String s,int[] arr){
    int[] count = new int[256];
    for(int i=0;i<s.length();i++){
      count[s.charAt(i)]++;
    }
    for(int i=0;i<s.length();i++){
      if(count[s.charAt(i)] > arr[s.charAt(i)]){
        return false;
      }
    }
    return true;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k,m,i,flag =0;
    WordBreak w = new WordBreak();
    int[] c = new int[256];
    String str,a;
    str = sc.nextLine();
    for(i=0;i<str.length();i++){
      c[str.charAt(i)]++;
    }
    k = sc.nextInt();
    m=k;
    sc.nextLine();
    while(k>0){
      a = sc.nextLine();
      System.out.println(w.Check(a,c));
      if(w.Check(a,c)){
        flag+=1;
      }
      k--;
    }
    System.out.println(flag);
    System.out.println(k);
    if(flag==m){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
  }
}
