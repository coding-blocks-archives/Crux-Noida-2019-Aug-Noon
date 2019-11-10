package com.company.Lec20;

import java.util.Scanner;

public class BInaryTree {


    private Node root;

    public void insert(Scanner s){
        this.root= insert(root,s);
    }

    private Node insert(Node node, Scanner s) {

        if(node==null){
            System.out.println("Enter the value");
            int value=Integer.parseInt(s.nextLine());
           return new Node(value);

        }

        System.out.println("Enter the direction");
        String dir = s.nextLine();
        if(dir.equals("left")){
            node.left= insert(node.left,s);
        }
        else{
            node.right= insert(node.right,s);
        }
        return node;
    }


    public class Node{

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
