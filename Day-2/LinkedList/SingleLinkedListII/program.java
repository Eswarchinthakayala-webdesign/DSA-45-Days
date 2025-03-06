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
    Node head;
    public void insert(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=newNode;
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
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }
    public void delete(int key)
    {
        Node temp=head,prev=null;
        if(temp!=null && temp.val==key)
        {
            head=temp.next;
            return;
        }
        while(temp!=null && temp.val!=key)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null) return;

        prev.next=temp.next;

    }
}
public class Main {
    public static void main(String[] args) {
      LinkedList ll=new LinkedList();
      ll.insertFirst(10);
      ll.insertFirst(20);
      ll.delete(10);
      ll.insert(30);
      ll.insertFirst(10);
      ll.display();
    }
}

