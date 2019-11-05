package com.company.Lec19;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    private Node root;

    public void insert(Scanner s){

        System.out.println("Enter the value of root");
        int n=s.nextInt();
        this.root=new Node(n);
        insert(s,root);
    }

    private void insert(Scanner s, Node node) {

        while(true){

            System.out.println("Do you want to add child"+node.value);
            boolean yes =s.nextBoolean();

            if(yes){

                System.out.println("Enter the value of child");
                int p=s.nextInt();
                Node child= new Node(p);
                node.children.add(child);
                insert(s,child);
            }

            else{
                break;
            }
        }
    }

    private class Node{

        private int value;
        private ArrayList<Node> children;

        public Node(int value){

            this.value=value;
            this.children=new ArrayList<>();
        }
    }
}
