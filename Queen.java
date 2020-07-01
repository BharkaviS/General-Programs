import java.io.*;
import java.util.*;

class Queen{
  static int n=4;
  public boolean isSafe(int row,int col,int[][] board){
    int i,j;
    for(i=0;i<col;i++){
      if(board[row][i]==1)
        return false;
    }
    for(i=row,j=col;i<n && j>=0;i++,j--){
      if(board[i][j]==1)
        return false;
    }
    for(i=row,j=col;i>0 && j>0;i--,j--){
      if(board[i][j]==1)
        return false;
    }
    return true;
  }

  public void printb(int[][] board){
    int i,j;
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println("");
    }
  }

  public void solveQ(int[][] board){

    if(Place(0,board)){
      printb(board);
    }
    else{
      System.out.println("No solution");
    }

  }

  public boolean Place(int col,int[][] board){
    int i;
    if(col>=n){
      return true;
    }

    for(i=0;i<n;i++){
      if(isSafe(i,col,board)){
        board[i][col]=1;

        if(Place(col+1,board)){
          return true;
        }
        board[i][col]=0;
      }
    }
    return false;
  }
  public static void main(String args[]){
    int n=4;
    int maze[][] = { { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 } };
      Queen r = new Queen();
      r.solveQ(maze);
  }
}
