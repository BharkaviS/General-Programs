import java.io.*;
import java.util.*;

class BinTree{
  static class Node{
    int key;
    Node left;
    Node right;
  Node (int key){
    this.key=key;
    left=null;
    right=null;
  }
}
  public void insert(Node node,int key){
    if(key<node.key){
      if(node.left!=null){
        insert(node.left,key);
      }
      else{
        node.left=new Node(key);
      }
    }
    else{
      if(node.right!=null){
        insert(node.right,key);
      }
      else{
        node.right = new Node(key);
      }
    }
  }

  public int heightOfTree(Node node){
    if(node==null){
      return 0;
    }
    else{
      int Lheight=0;
      int Rheight=0;
      if(node.left!=null){
        Lheight=heightOfTree(node.left);
      }
      if(node.right!=null){
        Rheight= heightOfTree(node.right);
      }
      int max = (Lheight > Rheight)? Lheight : Rheight;
      return max+1;
    }
  }

  public void leftViewUtil(Node node,int level){
    static int max_level=0;
          if(node==null){
            return;
          }
          if(max_level<level){
              System.out.println(node.key+" ");
              max_level=level;
          }
          leftViewUtil(node.left,level+1);
          leftViewUtil(node.right,level+1);
        }
    public void leftView(Node node){
      leftViewUtil(node,1);
    }

  public void PrintTree(Node node){
    if(node !=null){
      PrintTree(node.left);
      System.out.println(node.key+" ");
      PrintTree(node.right);
    }

  }

  public static void main(String args[]){
    BinTree b = new BinTree();


    Node root = new Node(8);
    b.insert(root,3);
    b.insert(root,1);
    b.insert(root,10);
    b.insert(root,6);
    b.insert(root,4);
    b.insert(root,7);
    b.insert(root,14);
    b.insert(root,13);
    b.PrintTree(root);
    System.out.println("The height of the tree is: "+b.heightOfTree(root));
    System.out.println("The left View is: ");
    b.leftView(root);
  }


}
