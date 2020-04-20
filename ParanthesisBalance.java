import java.io.*;
import java.util.*;

class ParanthesisBalance{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayList<Character> stack = new ArrayList<Character>();
    int i,j,c=0;
    char a;
    String input;
    input = sc.next();
    for(i=0;i<input.length();i++){
      if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{'){
        stack.add(input.charAt(i));
      }
      else if(input.charAt(i)==')' && stack.size()!=0){
        a = stack.remove(stack.size()-1);

        if(a=='(')
          c+=1;
      }
      else if(input.charAt(i)==']' && stack.size()!=0){
        a = stack.remove(stack.size()-1);

        if(a=='[')
          c+=1;
    }
    else if(input.charAt(i)=='}' && stack.size()!=0){
      a = stack.remove(stack.size()-1);

      if(a=='{')
        c+=1;
  }
  }
    if(c==input.length()/2){
      System.out.println("Balanced!");
    }
    else{
      System.out.println("Hmm...Nope!Not Balanced!");
    }
  }
}
