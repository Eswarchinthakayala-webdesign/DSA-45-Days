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
    Node(int val,Node next)
    {
        this.next=next;
        this.val=val;
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
    public void insert(int val,int index)
    {
        if(index==0)
        {
            insertFirst(val);

            return;
        }
        if(index==size)
        {
            insertLast(val);

            return;
        }
        else
        {
            Node temp=head;
            for (int i = 1; i < index; i++) {
                temp=temp.next;
            }
            Node newNode=new Node(val);
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }

    }
    public int deleteFirst()
    {
        int del=head.val;
        head=head.next;
        size--;
        return del;
    }
    public Node get(int index)
    {
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public int deleteLast()
    {
        if(size<=1)
        {
            deleteFirst();
        }
        Node secondLast=get(size-2);
        size--;
        tail=secondLast;
        tail.next=null;
        return tail.val;
    }

    public int deleteParticularIndex(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        if(index==size-1)
        {
            return deleteLast();
        }else
        {
            Node node=get(index-1);
            int val=node.next.val;
            node.next=node.next.next;
            return val;
        }
    }


}

class DoubleNode
{
    int val;
    DoubleNode next;
    DoubleNode prev;
    DoubleNode(int val)
    {
        this.val=val;
    }
    DoubleNode(int val,DoubleNode next,DoubleNode prev)
    {
        this.val=val;
        this.next=next;
        this.prev=prev;
    }
}
class DoubleLinkedList
{
    int size=0;
    DoubleNode head;
    DoubleNode tail;
    public void insertFirst(int val)
    {
        DoubleNode newNode=new DoubleNode(val);
        newNode.next=head;
        newNode.prev=null;
        if(head!=null)
        {
            head.prev=newNode;
        }
        head=newNode;
        size++;

    }

    public void insertLast(int val)
    {
        DoubleNode node=new DoubleNode(val);
        DoubleNode temp=head;
        if(head==null)
        {
            insertFirst(val);
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;

        }
        size++;
    }
    public void insert(int val,int index)
    {
        if(index==0)
        {
            insertFirst(val);
        }
        if(index==size)
        {
            insertLast(val);
        }
        else
        {
            DoubleNode node=new DoubleNode(val);
            DoubleNode temp=head;
            for (int i = 1; i <index ; i++) {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            node.prev=temp;
            if(node.next!=null)
            {
                node.next.prev=node;
            }


        }
    }
    public void display()
    {
        DoubleNode node=head;
        DoubleNode last=null;
        while(node!=null)
        {
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.print("End");
        System.out.println();
        while (last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.print("Start");

    }
}

class CircularNode
{
    int val;
    CircularNode next;
    CircularNode(int val)
    {
        this.val=val;
    }
}
class CircularLinkedList
{
    CircularNode head;
    CircularNode tail;
    public void insert(int val)
    {
        CircularNode node=new CircularNode(val);
        if(head==null)
        {
            head=tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display()
    {
        CircularNode temp=head;
        if(head!=null)
        {
            do{
                System.out.print(temp.val+" -> ");
                temp=temp.next;
            }while(temp!=head);
        }
        System.out.print("END");

    }
    public void delete(int val)
    {
        CircularNode node=head;
        if(node==null)
        {
            return;
        }
        if(node.val==val)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            CircularNode n=node.next;
            if(n.val==val)
            {
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }
}

public class Main {
    public static void main(String[] args) {
//     DoubleLinkedList list=new DoubleLinkedList();
//     list.insertFirst(10);
//     list.insertFirst(20);
//     list.insertLast(30);
//     list.insertLast(100);
//     list.insertFirst(40);
//     list.insert(99,5);
//     list.insert(47,3);
//     list.insert(48,3);
//     list.display();

        CircularLinkedList cll=new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.delete(20);
        cll.display();
    }
}

