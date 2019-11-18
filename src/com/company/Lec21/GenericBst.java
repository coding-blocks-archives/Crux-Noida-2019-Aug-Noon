package com.company.Lec21;

import java.util.LinkedList;
import java.util.Queue;

public class GenericBst<T extends Comparable<T>> {

    private Node root;

    public void insert(T value){

        this.root=insert(root,value);
    }


    private Node insert(Node node, T value) {

        if(node==null){

            Node child = new Node(value);
            return child;
        }


        if(node.value.compareTo(value)>0){
            node.left=insert(node.left,value);
        }

        if(node.value.compareTo(value)<0){
            node.right=insert(node.right,value);
        }

       return node;
    }

    public void display(){

        display(root,"");
    }

    private void display(Node node, String indent) {

        if(node==null){
           return;
        }

        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public LinkedList<T> sorted(){

        LinkedList<T> list= new LinkedList<>();

        return sorted(list,root);
    }

    private LinkedList<T> sorted(LinkedList<T> list, Node node) {

        if(node==null){
            return list;
        }

        sorted(list,node.left);
        list.add(node.value);
        sorted(list,node.right);

        return list;
    }


    private void inrange(T v1, T v2){

        inrange(root,v1,v2);
    }

    private void inrange(Node node, T v1, T v2) {

        if(node==null){
            return;
        }

        if(node.value.compareTo(v1)>0 &&node.value.compareTo(v2)<0 ) {
            System.out.println(node.value);
        }

        if(node.value.compareTo(v1)>0) {
            inrange(node.left, v1, v2);
        }

        if(node.value.compareTo(v2)<0) {
            inrange(node.right, v1, v2);
        }

    }

    public void levelorder(){

        levelorder(root);
    }

    private void levelorder(Node node) {

        Queue<Node> queue = new LinkedList();

        queue.add(node);

        while(!queue.isEmpty()){

            Node temp=queue.remove();
            System.out.println(temp.value);

            if(temp.left!=null){
                queue.add(temp.left);
            }

            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

    public T successor(T value){

        T successor= null;
        Node node= root;

        while(node!=null){

            if(node.value.compareTo(value)>0){

                if(successor==null || node.value.compareTo(successor)<0){

                    successor=node.value;
                }
                node=node.left;
            }
            else{
                node=node.right;
            }
        }

        return successor;
    }

    public class Node{

        T value;
        Node left;
        Node right;

        public Node(T value){

            this.value=value;
        }
    }
}
