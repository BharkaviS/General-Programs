import java.io.*;
import java.util.*;

class LinkedList{
  Node head;

  static class Node{
    int data;
    Node next;

    Node(int d){  //constructor
      data=d;
      next=null;
    }
  }
  public void printList(){
     Node n = head;
     while(n!=null){
       System.out.print(n.data+" -> ");
       n=n.next;
     }
     System.out.print("NULL");

  }
  public static void main(String args[]){
    LinkedList llist = new LinkedList();
    llist.head= new Node(1);
    Node first= new Node(2); //new objects for node class
    Node second=new Node(3); //new objects for node class
    llist.head.next=first;
    first.next = second;

    llist.printList();
  }
}
