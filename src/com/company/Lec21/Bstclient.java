package com.company.Lec21;

public class Bstclient {

    public static void main(String[] args) {

        GenericBst<Integer> tree = new GenericBst();

        tree.insert(10);
        tree.insert(3);
        tree.insert(15);
        tree.display();
        System.out.println(tree.sorted());

        System.out.println(tree.successor(11));
    }
}