package com.sriram.OOP3;
import java.util.*;
class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}
class LinkedList
{
    Node head,tail;
    int size=0;
    public void insertLast(int val)
    {

        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node newNode=new Node(val);
        tail.next=newNode;
        tail=newNode;
        size++;

    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void insertFirst(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=tail=newNode;


        }
        else {

            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void delete(int key)
    {
        if(head==null) return;


        if(head.val==key)
        {
            head=head.next;
            size--;
            return;
        }
        Node temp=head,prev=null;

        while(temp!=null && temp.val!=key)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null) return;

        prev.next=temp.next;
        if(temp==tail) tail=prev;
        size--;

    }
}
public class Main {
    public static void main(String[] args) {
      LinkedList ll=new LinkedList();
      ll.insertFirst(10);
      ll.insertFirst(20);
//      ll.delete(10);

      ll.insertFirst(10);
      ll.insertLast(99);
      ll.display();
    }
}

