package com.company.Lec19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenericTreeclient {

    public static void main(String[] args) throws FileNotFoundException {

        GenericTree tree = new GenericTree();
        File file = new File("input.txt");

        Scanner s= new Scanner(file);
        tree.insert(s);
        tree.display();
        System.out.println(tree.count());
    }
}
