package com.company.Lec21;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchtree<T> {

    private Node root;

    public void insert(int value){

        this.root=insert(root,value);
    }


    private Node insert(Node node, int value) {

        if(node==null){

            Node child = new Node(value);
            return child;
        }


        if(node.value>value){
            node.left=insert(node.left,value);
        }

        if(node.value<value){
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

    public class Node{

        int value;
        Node left;
        Node right;

        public Node(int value){

            this.value=value;
        }
    }
}
