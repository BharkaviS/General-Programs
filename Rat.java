import java.io.*;
import java.util.*;

class Rat{
  static int n=4;
  public boolean isSafe(int x,int y,int[][] board){
      if((x>=0 && x<n) && board[x][y]==1 && (y>=0 && y<n)){
        return true;
      }
      return false;
  }

  public void PrintB(int board[][]){
    int i,j;
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println("");
    }
  }

  /*public void solveR(int board[][]){
    int[][] res = new int[n][n];

    if(SolveMaze(0,0,board,res))
      PrintB(res);
    else
    System.out.println("No solutions");
  }*/

  public boolean SolveMaze(int x,int y,int board[][]/*,int res[][]*/){
    if(x==n-1 && y==n-1){
      return true;
    }

    if(isSafe(x,y,board)){
      //res[x][y]=1;

      if(SolveMaze(x+1,y,board))
      return true;

      if(SolveMaze(x,y+1,board))
      return true;

      //res[x][y]=0;
      return false;
    }
  return false;
  }

  public static void main(String args[]){
    int n=4;
    int maze[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };
      Rat r = new Rat();
      System.out.println(r.SolveMaze(0,0,maze));
  }
}
