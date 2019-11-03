package com.company.Lec18;

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

    public int kthfromlast(int k){

        Node slow=head;
        Node fast= head;

        for (int i = 0; i <k ; i++) {
            fast=fast.next;
        }

        while(fast!=null){

           slow=slow.next;
           fast=fast.next;
        }
        return slow.value;
    }

    public Node mid(){

        Node slow=head;
        Node fast=head;

//        while(fast!=null && fast.next!=null){
//
//            slow=slow.next;
//            fast=fast.next.next;
//        }
        while(fast.next!=null && fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public LinkedList mergesort(LinkedList list){
        if(list.size==1){
            return list;
        }

        Node mid= list.mid();

        LinkedList first= new LinkedList();
        first.head=list.head;
        first.tail=mid;
        first.size=(list.size+1)/2;

        LinkedList second =new LinkedList();
        second.head=mid.next;
        second.tail=list.tail;
        second.size=(list.size/2);

        mid.next=null;

        first= mergesort(first);
        second=mergesort(second);

        return merge(first,second);
    }


    public LinkedList merge (LinkedList first, LinkedList second){

        LinkedList list =new LinkedList();

        Node f= first.head;
        Node s=second.head;

        while(f!=null &&s!=null){

            if(f.value<s.value){
                list.insertlast(f.value);
                f=f.next;
            }
            else{
                list.insertlast(s.value);
                s=s.next;
            }
        }

        while(f!=null){
            list.insertlast(f.value);
            f=f.next;
        }

        while(s!=null){
            list.insertlast(s.value);
            s=s.next;
        }
        return list;
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
