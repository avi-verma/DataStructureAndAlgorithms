import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {
	public static  Node insert(Node head,int data) {
	    Node n=new Node(data);
	   Node last=head;
	       if(head==null){
	           head=n;
	       }else {
	    	   while(last.next!=null) {
	    		   last=last.next;
	    	   }
	    	   last.next=n;
	       }
	    return head;
	    }
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}