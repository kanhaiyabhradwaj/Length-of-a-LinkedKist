package linkedlist;

import java.util.Scanner;

public class question1 {
          
	/*
	 question : - find the length of a linkedlist.
	 */
	     
	
	public static Node<Integer> take(){
      Node<Integer> head=null;
      Scanner s=new Scanner(System.in);
      int data=s.nextInt();
      while(data!=-1) {
    	  Node<Integer> newnode=new Node<Integer>(data);
    	  if(head==null) {
    		  head=newnode;
    	
    	  }else {
    		 Node<Integer> temp=head;
    		 while(temp.next!=null) {
    			 temp=temp.next;
    		 }
    		 temp.next=newnode;
    	  }
    	  data=s.nextInt();
      }
      return head;
	}
	
	public static void print(Node<Integer> head) {
		int count=0;
		while(head!=null) {
			count++;
		head=head.next;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
        Node<Integer> head=take();
         print(head);        
        
	}

}
