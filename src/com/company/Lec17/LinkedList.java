package com.company.Lec17;

public class LinkedList {

    private Node head;

    private Node tail;

    private int size=0;


    public void insertfirst(int value){

        Node node = new Node(value);
        node.next=head;
        head=node;

        size++;
        if(tail==null){
            tail=head;
        }
    }

    public void insertlast(int value){

        if(size<1){
            insertfirst(value);
            return;
        }

        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deletefirst(){

        if(size==0){
            System.out.println("Khaali he be");
            return 0;
        }

        int temp= head.value;
        head=head.next;
        size--;

        return temp;
    }

    public int deletelast(){

        Node temp= head;

        while(temp.next!=tail){
            temp=temp.next;
        }

        int del= temp.next.value;
        tail=temp;
        tail.next=null;
        size--;
        return del;
    }

    public int deleteatindex(int index){

        if(size<2){
           return deletefirst();
        }

        if(index==size-1){
            return deletelast();
        }

        Node prev =get(index-1);
        int temp= prev.next.value;
        prev.next=prev.next.next;
        size--;
        return temp;
    }

    public void duplicates(){

         Node temp= head;

         while(temp.next!=null){

             if(temp.value==temp.next.value){
                 temp.next=temp.next.next;
                 size--;
             }
             else {
                 temp = temp.next;
             }
         }
         tail=temp;
    }


    public void insertbetween(int value,int index){

        if(index==0){
            insertfirst(value);
            return;
        }

        if(index==size){
            insertlast(value);
            return;
        }

        Node prev= get(index-1);
        Node node = new Node(value);
        node.next=prev.next;
        prev.next=node;
        size++;
    }

    public Node get(int index){

        Node temp=head;

        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public void display(){

        Node temp =head;

        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }



    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
