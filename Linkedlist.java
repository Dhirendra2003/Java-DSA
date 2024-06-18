package javaFiles;
import java.util.*;
public class Linkedlist {
    Node head=null;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }

    }

    public void createNode(String data){
        Node n1=new Node(data) ;
        if(head==null){
           head=n1;
        }
        else {
            Node currentNode=head;
            while (currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=n1;
        }
    }
    public void display(){
        Node currentNode=head;
        while (currentNode!=null){
            System.out.print(" ->"+currentNode.data);
            currentNode=currentNode.next;
        }
    }

    public void revList(){
        if(head==null || head.next==null){
            System.out.println("list is empty");
            return;
        }
        Node curr=head;
        Node next=null;
        Node prev=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            head=curr;
            prev=curr;
            curr=next;
        }
        System.out.println();
        display();
    }
//    public void revList() {
//        if (head == null || head.next == null) {
//            System.out.println("list is empty or has only one element");
//            return;
//        }
//
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//
//        while (current != null) {
//            next = current.next; // Store the next node
//            current.next = prev; // Reverse the current node's pointer
//            prev = current; // Move prev one step ahead
//            current = next; // Move current one step ahead
//        }
//        head = prev; // Update head to the new first node
//
//        display();
//    }

    public static void main(String[] args) {

        Linkedlist l1=new Linkedlist();
        l1.createNode("1");
        l1.createNode("2");
        l1.createNode("3");
        l1.createNode("4");
        l1.createNode("5");
        l1.display();
        l1.revList();
    }
}
